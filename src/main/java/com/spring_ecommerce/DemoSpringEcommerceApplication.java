package com.spring_ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class DemoSpringEcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringEcommerceApplication.class, args);
	}

}
