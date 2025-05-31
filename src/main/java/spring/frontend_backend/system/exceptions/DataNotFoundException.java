package spring.frontend_backend.system.exceptions;

public class DataNotFoundException extends RuntimeException {
  public DataNotFoundException(String questionNotFound) {
    super(questionNotFound);
  }
}
