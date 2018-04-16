package com.sweeneyb.listBackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class ListBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(ListBackendApplication.class, args);
	}
}
