package spring.frontend_backend.system.exceptions;

import spring.frontend_backend.system.data.Constants;
import org.springframework.http.HttpStatus;

public class MyRestException extends Exception{

  private static final long serialVersion = 2938200938503L;

  Constants.ExceptionClass exceptionClass;
  HttpStatus httpStatus;
  public MyRestException(Constants.ExceptionClass exceptionClass, HttpStatus httpStatus, String message) {
    super(exceptionClass.toString()+ ": " + message);
    this.exceptionClass = exceptionClass;
    this.httpStatus = httpStatus;
  }
  public Constants.ExceptionClass getExceptionClass () {
    return exceptionClass;
  }
  public int getHttpStatusCode() {
    return httpStatus.value();
  }
  public String getHttpStatusType() {
    return httpStatus.getReasonPhrase();
  }
  public HttpStatus getHttpStatus() {
    return httpStatus;
  }
}