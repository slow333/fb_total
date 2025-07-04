package spring.frontend_backend.board.question;

import spring.frontend_backend.board.user.UserInfor;
import spring.frontend_backend.system.exceptions.DataNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class QuestionService {

  private final QuestionRepository questionRepository;


  public Page<Question> getList(int page) {

    List<Sort.Order> sorts = new ArrayList<>();
    sorts.add(Sort.Order.desc("createDate"));

    Pageable pageable = PageRequest.of(page, 10, Sort.by(sorts));

    return this.questionRepository.findAll(pageable);
  }

  public Question getQuestion(Integer id) throws DataNotFoundException {

    Optional<Question> question = this.questionRepository.findById(id);
    if (question.isPresent()) {
      return question.get();
    } else {
      throw new DataNotFoundException("Question not found");
    }
  }

  public void addQuestion(String subject, String content, UserInfor userInfor) {
    Question question = new Question();
    question.setSubject(subject);
    question.setContent(content);
    question.setCreateDate(LocalDateTime.now());
    question.setAuthor(userInfor);
    this.questionRepository.save(question);
  }

  public void modify(Question question, String subject, String content) {
    question.setSubject(subject);
    question.setContent(content);
    question.setModifyDate(LocalDateTime.now());
    this.questionRepository.save(question);
  }

  public void delete(Question question) {
    this.questionRepository.delete(question);
  }

  public void like(Question question, UserInfor userInfor) {
    question.getLike().add(userInfor);
    this.questionRepository.save(question);
  }
}

