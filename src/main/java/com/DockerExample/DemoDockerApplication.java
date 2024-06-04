package com.DockerExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoDockerApplication {

	@GetMapping("/message")
	public String message(){
		return "Docker Image";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoDockerApplication.class, args);
	}

}
