package com.interview.aquariustest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class AquariustestApplication {

	public static void main(String[] args) {
		SpringApplication.run(AquariustestApplication.class, args);
	}

}
