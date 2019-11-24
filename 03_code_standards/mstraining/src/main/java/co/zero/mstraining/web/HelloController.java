package co.zero.mstraining.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Some useful text for documentation.
 */
@RestController
public class HelloController {

  /**
   * Some useful text for documentation.
   *
   * @return A parameter description.
   */
  @GetMapping
  public String helloWorld() {
    return "Hello world!!!";
  }
}
