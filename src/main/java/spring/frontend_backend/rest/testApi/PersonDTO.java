package spring.frontend_backend.rest.testApi;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonDTO {

  String name;
  Integer age;

  @Override
  public String toString() {
    return "PersonDTO{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
  }
}
