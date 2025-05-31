package spring.frontend_backend.board.question;

import spring.frontend_backend.board.answer.AnswerForm;
import spring.frontend_backend.board.user.UserInfor;
import spring.frontend_backend.board.user.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.security.Principal;

@Controller
@RequestMapping("/board/question")
@RequiredArgsConstructor
public class QuestionController {

  private final QuestionService questionService;
  private final UserService userService;
  private String baseUrl = "board/";

  @GetMapping("/question_list")
  public String pagingQuestionList(Model model,
                                   @RequestParam(value = "page", defaultValue = "0") int page) {
    Page<Question> paging = this.questionService.getList(page);
    model.addAttribute("pagingList", paging);
    return baseUrl + "question_list";
  }

  @PreAuthorize("isAuthenticated()")
  @GetMapping(value = {"/question_detail/{id}", "/question_detail"})
  public String detailQuestion(Model model,
                               @PathVariable(required = false, name="id") Integer id,
                               AnswerForm answerForm) {
    if (id == null) {
      id = 1;
    }
    Question question = this.questionService.getQuestion(id);
    model.addAttribute("question", question);
    return baseUrl + "question_detail";
  }

  @PreAuthorize("isAuthenticated()")
  @GetMapping("/create")
  public String createQuestion(QuestionForm questionForm) {
    return baseUrl + "question_form";
  }

  @PreAuthorize("isAuthenticated()")
  @PostMapping("/create")
  public String createQuestion(@Valid QuestionForm questionForm,
                               BindingResult bindingResult,
                               Principal principal) {
    if (bindingResult.hasErrors()) {
      return baseUrl + "question_form";
    }
    UserInfor userInfor = this.userService.getUser(principal.getName());

    this.questionService.addQuestion(questionForm.getSubject(), questionForm.getContent(), userInfor);

    return "redirect:/board/question/question_list";
  }

  @PreAuthorize("isAuthenticated()")
  @GetMapping("/modify/{id}")
  public String questionModify(QuestionForm questionForm,
                               @PathVariable("id") Integer id, Principal principal) {

    Question question = this.questionService.getQuestion(id);
    if (!question.getAuthor().getUsername().equals(principal.getName())) {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "수정권한이 없습니다.");
    }
    questionForm.setSubject(question.getSubject());
    questionForm.setContent(question.getContent());
    return baseUrl + "question_form";
  }

  @PreAuthorize("isAuthenticated()")
  @PostMapping("/modify/{id}")
  public String questionModify(
          @Valid QuestionForm questionForm, BindingResult bindingResult,
          Principal principal,
          @PathVariable("id") Integer id) {
    if (bindingResult.hasErrors()) {
      return baseUrl + "question_form";
    }
    Question question = this.questionService.getQuestion(id);
    if (!question.getAuthor().getUsername().equals(principal.getName())) {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "수정권한이 없습니다.");
    }
    this.questionService.modify(question, questionForm.getSubject(), questionForm.getContent());
    return String.format("redirect:/board/question/question_detail/%s", id);
  }

  @PreAuthorize("isAuthenticated()")
  @GetMapping("/delete/{id}")
  public String questionDelete(Principal principal,
                               @PathVariable("id") Integer id) {
    Question question = this.questionService.getQuestion(id);
    if (!question.getAuthor().getUsername().equals(principal.getName())) {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "삭제권한이 없습니다.");
    }
    this.questionService.delete(question);
    return "redirect:/board/question/question_list";
  }

  @PreAuthorize("isAuthenticated()")
  @GetMapping("/like/{id}")
  public String questionLike(Principal principal, @PathVariable("id") Integer id) {
    Question question = this.questionService.getQuestion(id);
    UserInfor userInfor = this.userService.getUser(principal.getName());
    this.questionService.like(question, userInfor);
    return String.format("redirect:/board/question/question_detail/%s", id);
  }
}
