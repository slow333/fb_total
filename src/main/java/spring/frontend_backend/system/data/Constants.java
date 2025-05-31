package spring.frontend_backend.system.data;

public class Constants {
  
  public enum ExceptionClass {
    PRODUCT("Product"), BUYER("Buyer");

    String exceptionClass;
    ExceptionClass(String value){
      this.exceptionClass = value;
    }
    public String getExceptionClass() {
      return exceptionClass;
    }

    @Override
    public String toString() {
      return getExceptionClass() + " Exception. ";
    }
  }
}
