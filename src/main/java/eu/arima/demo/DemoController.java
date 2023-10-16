package eu.arima.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class DemoController {

    @GetMapping("/time")
    String hello() {
        return "Current time: " + LocalDateTime.now();
    }

}
