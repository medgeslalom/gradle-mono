package io.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Main {
  public static void main(String[] args) {
    SpringApplication.run(Main.class, args);
  }

  @RestController
  static class Index {

    @GetMapping("/info")
    public String info() {
      var bok = new Bok("Lombok from a Library", 1);
      return "User Service: " + bok.toString();
    }
  }
}
