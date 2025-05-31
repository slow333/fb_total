package spring.frontend_backend.rest.testApi;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/test")
public class RestApiSampleController {

  @GetMapping("/request")
  public String getReqParam(@RequestParam(name = "name", defaultValue = "rest3.4") String name,
                            @RequestParam(name = "age", defaultValue = "55") Integer age) {
    return "name : " + name + ", age : " + age;
  }

  @GetMapping("/request2")
  public String getReqParam2(@RequestParam Map<String, Object> map) {
    StringBuilder sb = new StringBuilder();
    map.forEach((key, value) -> sb.append(key + ":" + value+"\n"));
    return sb.toString();
  }

  @GetMapping("/request3")
  public String getReqParam3(PersonDTO personDTO) {
    return personDTO.toString();
  }

  @GetMapping("/variable/{variable}")
  public String getPathVariable(@PathVariable("variable") String variable) {
    return variable;
  }

  @PostMapping("/person")
  public String postPerson(@RequestBody Map<String, Object> person) {
    StringBuilder sb = new StringBuilder();
    person.forEach((key, value) -> sb.append(key + ":" + value+"\n"));
    return sb.toString();
  }
  @PostMapping("/person2")
  public String postPerson2(@RequestBody PersonDTO personDTO) {
    return personDTO.toString();
  }

  @PostMapping("/person3")
  public String postPerson3(@RequestParam("name") String name,
                            @RequestParam("age") String age) {
    return name + ", "+age;
  }

  @PutMapping("/put-default")
  public String putMethod() {
    return "Put default";
  }
  @PutMapping("/put-person")
  public String putPerson(@RequestBody Map<String, Object> person) {
    StringBuilder sb = new StringBuilder();
    person.forEach((key, value) -> sb.append(key + ":" + value+"\n"));
    return sb.toString();
  }
  @PutMapping("/put-person2")
  public String putPerson2(@RequestBody PersonDTO personDTO) {
    return personDTO.toString();
  }
  @PutMapping("/put-person3")
  public ResponseEntity<PersonDTO> putPerson3(@RequestBody PersonDTO personDTO) {
    return ResponseEntity.status(HttpStatus.ACCEPTED).body(personDTO);
  }

  @DeleteMapping("/delete/{id}")
  public String deletePerson(@PathVariable("id") String id) {
    return id;
  }

}
