package spring.frontend_backend.board.answer;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import spring.frontend_backend.board.question.Question;
import spring.frontend_backend.board.user.UserInfor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

@Entity
@Getter
@Setter
public class Answer {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(columnDefinition = "TEXT")
  private String content;

  private LocalDateTime createDate;
  private LocalDateTime modifyDate;

  @ManyToOne
  private Question question;

  @ManyToOne
  private UserInfor author;

  @ManyToMany
  Set<UserInfor> like;

  @Override
  public String toString() {
    DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    String dt = createDate.format(dtFormatter);
//    String dt = createDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    return "Answer{" +
            "id=" + id +
            ", content='" + content + '\'' +
            ", createDate=" + dt +
            ", question=" + question +
            '}';
  }
}
