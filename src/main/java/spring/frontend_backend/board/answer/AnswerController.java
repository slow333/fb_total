package spring.frontend_backend.board.answer;

import spring.frontend_backend.board.question.Question;
import spring.frontend_backend.board.question.QuestionService;
import spring.frontend_backend.board.user.UserInfor;
import spring.frontend_backend.board.user.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.security.Principal;

@Controller
@RequestMapping("/board/answer")
@RequiredArgsConstructor
public class AnswerController {

  private final QuestionService questionService;
  private final AnswerService answerService;
  private final UserService userService;

  @PreAuthorize("isAuthenticated()")
  @PostMapping("/create/{id}")
  public String createAnswer(Model model, @PathVariable("id") Integer id,
                             @Valid AnswerForm answerForm, BindingResult bindingResult,
                             Principal principal) {

    Question question = this.questionService.getQuestion(id);
    UserInfor userInfor = this.userService.getUser(principal.getName());
    // validation 관련(AnswerForm을 받아서 처리)
    if (bindingResult.hasErrors()) {
      model.addAttribute("question", question);
      return "board/question_detail";
    }
    // 정상적 일때
    Answer answer = this.answerService.create(question, answerForm.getContent(), userInfor);
    return String.format("redirect:/board/question/question_detail/%s#answer_%s",
            answer.getQuestion().getId(), answer.getId());
  }

  @PreAuthorize("isAuthenticated()")
  @GetMapping("/modify/{id}")
  public String answerModify(AnswerForm answerForm,
                             @PathVariable("id") Integer id,
                             Principal principal) {
    Answer answer = this.answerService.getAnswer(id);
    if (!answer.getAuthor().getUsername().equals(principal.getName())) {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "수정권한이 없습니다.");
    }
    answerForm.setContent(answer.getContent());
    return "board/answer_form";
  }

  @PreAuthorize("isAuthenticated()")
  @PostMapping("/modify/{id}")
  public String answerModify(@Valid AnswerForm answerForm, BindingResult bindingResult,
                             @PathVariable("id") Integer id,
                             Principal principal) {
    if (bindingResult.hasErrors()) {
      return "board/answer_form";
    }
    Answer answer = this.answerService.getAnswer(id);
    if (!answer.getAuthor().getUsername().equals(principal.getName())) {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "수정권한이 없습니다.");
    }
    this.answerService.modify(answer, answerForm.getContent());
    return String.format("redirect:/board/question/question_detail/%s#answer_%s",
            answer.getQuestion().getId(), answer.getId());
  }

  @PreAuthorize("isAuthenticated()")
  @GetMapping("/delete/{id}")
  public String answerDelete(Principal principal,
                             @PathVariable("id") Integer id) {
    Answer answer = this.answerService.getAnswer(id);
    if (!answer.getAuthor().getUsername().equals(principal.getName())) {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "삭제권한이 없습니다.");
    }
    this.answerService.delete(answer);
    return String.format("redirect:/board/question/question_detail/%s#answer_%s",
            answer.getQuestion().getId());
  }

  @PreAuthorize("isAuthenticated()")
  @GetMapping("/like/{id}")
  public String answerLike(@PathVariable("id") Integer id,
                           Principal principal) {
    Answer answer = this.answerService.getAnswer(id);
    UserInfor userInfor = this.userService.getUser(principal.getName());
    this.answerService.like(answer, userInfor);
    return String.format("redirect:/board/question/question_detail/%s#answer_%s",
            answer.getQuestion().getId(), answer.getId());
  }
}
