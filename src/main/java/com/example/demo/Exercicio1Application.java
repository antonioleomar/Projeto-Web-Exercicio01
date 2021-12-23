package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

//@EntityScan(basePackages = "domain")
@SpringBootApplication
public class Exercicio1Application {

	public static void main(String[] args) {
		SpringApplication.run(Exercicio1Application.class, args);
	}

}
