package com.spring.UC_4.DI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Uc4DiApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(Uc4DiApplication.class, args);


		// Retrieve EmployeeBean from ApplicationContext
		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
		employeeBean.showEmployeeDetails();
	}

}
