package com.hendisantika;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.thymeleaf.ThymeleafAutoConfiguration;

@SpringBootApplication(exclude = {ThymeleafAutoConfiguration.class})
public class SpringBootMailgunTemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMailgunTemplateApplication.class, args);
    }

}
