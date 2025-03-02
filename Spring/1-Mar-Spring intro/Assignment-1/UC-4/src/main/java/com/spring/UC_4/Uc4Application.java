package com.spring.UC_4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication(scanBasePackages = "com.spring.UC_4")
@ComponentScan("com.spring.UC_4.controller")
public class Uc4Application {

	public static void main(String[] args) {
		SpringApplication.run(Uc4Application.class, args);
	}

}
