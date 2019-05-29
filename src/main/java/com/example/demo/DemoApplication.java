package com.example.demo;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLinerRunner(ApplicationContext aplApplicationContext) {
		return args -> {
			//System.out.println("Beans Spring Boot");
			
			String[] beansNames = aplApplicationContext.getBeanDefinitionNames();
			Arrays.sort(beansNames);
			
			for (String beanName : beansNames) {
				//System.out.println(beanName);
			}
		};
	}
	
}
