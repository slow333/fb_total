package spring.frontend_backend.urlcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/java")
public class JavaBasicController {

  // ==============================================================================
  // 01 java basic
  // ==============================================================================
  @GetMapping("/01-basic/00-sts-setting")
  public String javaBasicStsSetting() {
    return "java/01-basic/00-sts-setting";
  }
  @GetMapping("/01-basic/01-data-type")
  public String javaBasicDataType() {
    return "java/01-basic/01-data-type";
  }
  @GetMapping("/01-basic/02-if-for")
  public String javaBasicIf() {
    return "java/01-basic/02-if-for";
  }
  @GetMapping("/01-basic/03-array")
  public String javaArray() {
    return "java/01-basic/03-array";
  }
  @GetMapping("/01-basic/04-stream")
  public String javaStream() {
    return "java/01-basic/04-stream";
  }
  @GetMapping("/01-basic/05-enum")
  public String javaEnum() {
    return "java/01-basic/05-enum";
  }

  // ==============================================================================
  //02 OOP
  // ==============================================================================
  @GetMapping("/02-oop/01-oop-intro")
  public String javaOopIntro() {
    return "java/02-oop/01-oop-intro";
  }
  @GetMapping("/02-oop/02-oop-1")
  public String javaOop1() {
    return "java/02-oop/02-oop-1";
  }

  // ==============================================================================
  //03 Advanced
  // ==============================================================================
  @GetMapping("/03-adv/01-Object")
  public String javaAdvObject() {
    return "java/03-adv/01-Object";
  }
  @GetMapping("/03-adv/02-String")
  public String javaAdvString() {
    return "java/03-adv/02-String";
  }
  @GetMapping("/03-adv/03-StringBuffer")
  public String javaAdvStringBuffer() {
    return "java/03-adv/03-StringBuffer";
  }
  @GetMapping("/03-adv/04-Math")
  public String javaAdvMath() {
    return "java/03-adv/04-Math";
  }
  @GetMapping("/03-adv/05-LocalDateTime")
  public String javaAdvLocalDateTime() {
    return "java/03-adv/05-LocalDateTime";
  }
  @GetMapping("/03-adv/06-Collection-fw1")
  public String javaAdvFw1() {
    return "java/03-adv/06-Collection-fw1";
  }
  @GetMapping("/03-adv/07-Collection-fw2")
  public String javaAdvFw2() {
    return "java/03-adv/07-Collection-fw2";
  }
}
