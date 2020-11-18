package com.example.egressdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EgressDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EgressDemoApplication.class, args);
	}

	@GetMapping("/hello")
	String getTest(){
		return "Hello OpenShift";
	}

	
}
