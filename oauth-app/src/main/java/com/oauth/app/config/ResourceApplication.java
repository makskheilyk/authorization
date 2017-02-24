package com.oauth.app.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class ResourceApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ResourceApplication.class, args);
	}
}