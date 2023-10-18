package eu.arima.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class DemoController {

    private final String databaseUrl;

    private final String databaseUsername;

    public DemoController(@Value("${database-url:not-found}") String databaseUrl, @Value("${database-username:not-found}")String databaseUsername) {
        this.databaseUrl = databaseUrl;
        this.databaseUsername = databaseUsername;
    }

    @GetMapping("/version")
    String version() {
        return "v4.0";
    }

    @GetMapping("/time")
    String hello() {
        return "Current time: " + LocalDateTime.now();
    }

    @GetMapping("/database")
    String database() {
        return this.databaseUrl + ":" + this.databaseUsername;
    }

}
