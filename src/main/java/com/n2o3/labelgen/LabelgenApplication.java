package com.n2o3.labelgen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:config.properties")
@SpringBootApplication
public class LabelgenApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabelgenApplication.class, args);
	}

}
