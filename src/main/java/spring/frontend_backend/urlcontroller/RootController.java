package spring.frontend_backend.urlcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RootController {

  @GetMapping("/")
  public String root() {
    return "index";
  }

  @GetMapping("/board/nav_bar")
  public String advNavBar() {
    return "board/nav_bar";
  }

  @GetMapping("/apis/board-list")
  public String mainBoardList() {
    return "apis/board-list";
  }

}
