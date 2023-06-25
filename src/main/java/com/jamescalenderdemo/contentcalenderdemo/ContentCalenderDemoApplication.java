package com.jamescalenderdemo.contentcalenderdemo;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ContentCalenderDemoApplication {

	public static void main(String[] args) {
		// ConfigurableApplicationContext context = SpringApplication.run(ContentCalenderDemoApplication.class, args);
		// Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		SpringApplication.run(ContentCalenderDemoApplication.class, args);
	}

}
