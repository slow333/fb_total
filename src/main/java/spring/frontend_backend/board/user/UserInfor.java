package spring.frontend_backend.board.user;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class UserInfor {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(unique=true, length=25)
  private String username;

  private String password;

  @Column(unique=true, length=50)
  private String email;

  private LocalDateTime subscribeDate;
}
