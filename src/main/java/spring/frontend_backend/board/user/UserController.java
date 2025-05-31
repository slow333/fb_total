package spring.frontend_backend.board.user;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@Controller
@RequestMapping("/board")
@RequiredArgsConstructor
public class UserController {

  private final UserService userService;

  @GetMapping("/signup")
  public String signup(UserForm userForm){
    return "board/signup_form";
  }

  @PostMapping("/signup")
  public String signup(@Valid UserForm userForm, BindingResult bindingResult){
    if (bindingResult.hasErrors()) {
      return "board/signup_form";
    }
    if(!userForm.getPassword().equals(userForm.getPasswordCheck())){
      bindingResult.rejectValue("passwordCheck", "passwordInCorrect",
              "2개의 패스워드가 일치하지 않습니다.");
      return "board/signup_form";
    }
    try {
      this.userService.createUser(userForm.getUsername(), userForm.getEmail(),
              userForm.getPassword(), LocalDateTime.now());
    } catch (DataIntegrityViolationException e) {
      e.printStackTrace();
      bindingResult.reject("singupFailed", "이미 등록된 사용자입니다.");
      return "ui/user/signup_form";
    } catch (Exception e) {
      e.printStackTrace();
      bindingResult.reject("singupFailed", e.getMessage());
      return "board/signup_form";
    }
    return "redirect:/board/question/question_list";
  }

  @GetMapping("/login")
  public String login() {
    return "board/login_form";
  }

//  @GetMapping("/loginCheck")
//  public String userLogin(@RequestParam(value = "username") String username,
//                          @RequestParam(value = "password") String password) {
//    if(!this.userService.checkLogin(username, password).isPresent()){
//      return "board/login_form";
//    }
//
//    return "redirect:/board/question/question_list";
//  }

}
