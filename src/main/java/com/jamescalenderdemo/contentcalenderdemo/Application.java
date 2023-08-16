package com.jamescalenderdemo.contentcalenderdemo;

import java.time.LocalDateTime;
import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.jamescalenderdemo.contentcalenderdemo.model.Content;
import com.jamescalenderdemo.contentcalenderdemo.model.Status;
import com.jamescalenderdemo.contentcalenderdemo.model.Type;
import com.jamescalenderdemo.contentcalenderdemo.repository.ContentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		// ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		// Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		SpringApplication.run(Application.class, args);
	}

	@Bean // if you want to create instance of class using method use @bean
	CommandLineRunner commandLineRunner(ContentRepository repository){
		return args -> {
			   Content c = new Content( null,
                "how to be a dog by Daisy",
                "daisy is a dog",
                Status.IDEA,
                Type.COURSE,
                LocalDateTime.now(),
                null,
                "");
				repository.save(c); 
		};
	}

}
 