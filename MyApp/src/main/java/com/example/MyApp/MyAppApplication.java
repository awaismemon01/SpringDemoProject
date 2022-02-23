package com.example.MyApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class MyAppApplication extends SpringBootServletInitializer {

	

	public static void main(String[] args) {
		SpringApplication.run(MyAppApplication.class, args);
	}

}
