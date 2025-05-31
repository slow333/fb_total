package spring.frontend_backend.board.answer;

import spring.frontend_backend.board.question.Question;
import spring.frontend_backend.board.user.UserInfor;
import spring.frontend_backend.system.exceptions.DataNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AnswerService {

  private final AnswerRepository answerRepository;

  public Answer create(Question question, String content, UserInfor author) {

    Answer answer = new Answer();
    answer.setContent(content);
    answer.setCreateDate(LocalDateTime.now());
    answer.setQuestion(question);
    answer.setAuthor(author);

    this.answerRepository.save(answer);
    return answer;
  }

  public Answer getAnswer(Integer id) {
    Optional<Answer> answer = this.answerRepository.findById(id);
    if(answer.isPresent()){
      return answer.get();
    } else {
      throw new DataNotFoundException("no answer");
    }
  }

  public void modify(Answer answer, String content) {
    answer.setContent(content);
    answer.setModifyDate(LocalDateTime.now());
    this.answerRepository.save(answer);
  }

  public void delete(Answer answer) {
    this.answerRepository.delete(answer);
  }

  public void like(Answer answer, UserInfor userInfor) {
    answer.getLike().add(userInfor);
    this.answerRepository.save(answer);
  }
}
