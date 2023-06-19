package io.lombocska.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.metrics.buffering.BufferingApplicationStartup;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SimpleApplication {

//    public static void main(String[] args) {
//        SpringApplication.run(SimpleApplication.class, args);
//    }

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SimpleApplication.class);
        app.setApplicationStartup(new BufferingApplicationStartup(2048));
        app.run(args);
    }

}
