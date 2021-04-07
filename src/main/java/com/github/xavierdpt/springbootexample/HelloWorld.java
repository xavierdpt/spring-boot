package com.github.xavierdpt.springbootexample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorld {

  @GetMapping("/helloworld")
  @ResponseBody
  public String helloWorld() {
    return "Hello World!";
  }

}
