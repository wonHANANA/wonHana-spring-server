package com.wonhana.kau.wonhana;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class WonHanaApplication {

    public static void main(String[] args) {
        SpringApplication.run(WonHanaApplication.class, args);
    }

}
