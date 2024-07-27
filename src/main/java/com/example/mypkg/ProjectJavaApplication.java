package com.example.mypkg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ProjectJavaApplication {

	@RequestMapping(value="/")
	public String index() {
		return "<h1>asd</h1>";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ProjectJavaApplication.class, args);
	}

}
