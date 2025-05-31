package spring.frontend_backend.board.user;

import spring.frontend_backend.system.exceptions.DataNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserService {

  private final UserRepository userRepository;
  private final PasswordEncoder passwordEncoder;

  public UserInfor createUser(String username, String email, String password, LocalDateTime date) {
    UserInfor user = new UserInfor();
    user.setUsername(username);

    user.setPassword(passwordEncoder.encode(password));
    user.setEmail(email);
    user.setSubscribeDate(date);
    this.userRepository.save(user);

    return user;
  }

  public UserInfor getUser(String username) {
    Optional<UserInfor> userInfor = this.userRepository.findByusername(username);
    if (userInfor.isPresent()) {
      return userInfor.get();
    } else {
      throw new DataNotFoundException("User is not present");
    }
  }

//  public Optional<UserInfor> checkLogin(String username, String password){
//    return this.userRepository.findByUsernameAndPassword(username, password);
//  }

}
