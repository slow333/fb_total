package spring.frontend_backend.board.question;

import spring.frontend_backend.board.answer.Answer;
import spring.frontend_backend.board.user.UserInfor;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
public class Question {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(length = 200)
  private String subject;

  @Column(columnDefinition = "TEXT")
  private String content;

  private LocalDateTime createDate;
  private LocalDateTime modifyDate;

  @OneToMany(mappedBy = "question" , cascade = CascadeType.REMOVE)
  private List<Answer> answerList;

  @ManyToOne
  private UserInfor author;

  @ManyToMany
  Set<UserInfor> like;

  @Override
  public String toString() {
    String dt = createDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    return "{ id: "+id+", subject : "+subject+", content: " + content +", subDateTime : "+  dt;
  }
}
