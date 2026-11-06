package com.mysite.springboot4developer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Springboot4DeveloperApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot4DeveloperApplication.class, args);
    }

}
