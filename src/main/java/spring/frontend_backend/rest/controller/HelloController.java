package spring.frontend_backend.rest.controller;

import spring.frontend_backend.system.data.Greeting;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloController {
  private static final String template = "Hello, %s!";
  private final AtomicLong counter = new AtomicLong();
  private final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

  @GetMapping("/hello")
  @ResponseBody
  public String helloController() {
    return "Hello Rest api";
  }

  @GetMapping("/greeting")
  public Greeting greeting(
          @RequestParam(value = "name", defaultValue = "World") String name) {
    return new Greeting(counter.incrementAndGet(), String.format(template, name));
    // json 객체를 돌려줌: {id: ..., content:...}
  }

  @GetMapping("/log-test")
  public void logTest() {
    LOGGER.trace("Trace log");
    LOGGER.debug("debut log");
    LOGGER.info("infor log");
    LOGGER.warn("warning log");
    LOGGER.error("ERROR LOG");
  }
}
