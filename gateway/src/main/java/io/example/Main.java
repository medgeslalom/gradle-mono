package io.example;

import javax.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Slf4j
public class Main {
  public static void main(String[] args) {
    SpringApplication.run(Main.class, args);
  }

  @PostConstruct
  public void onStartup() {
    log.info(Ver.VERSION);
  }

  @RestController
  static class Index {

    @GetMapping("/info")
    public String info() {
      return "Gateway: " + Ver.VERSION;
    }
  }
}
