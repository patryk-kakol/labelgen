package com.protolab.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:config.properties")
@SpringBootApplication
public class ProtolabRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProtolabRestApplication.class, args);
    }

}
