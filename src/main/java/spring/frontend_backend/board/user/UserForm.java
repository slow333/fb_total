package spring.frontend_backend.board.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class UserForm {

  @NotEmpty(message = "username은 필수.")
  @Size(min = 3, max = 25)
  private String username;
  
  @NotEmpty(message = "password는 필수")
  @Size(min = 3, message = "암호는 3자 이상")
  private String password;

  @NotEmpty(message = "password check는 필수")
  @Size(min = 3, message = "암호는 3자 이상")
  private String passwordCheck;

  @Email
  @NotEmpty(message = "email required")
  private String email;
}
