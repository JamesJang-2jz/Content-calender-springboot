package com.jamescalenderdemo.contentcalenderdemo.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@Configuration
public class MyWebConfig {
    

    @Bean
    public RestTemplate RestTemplate (){
        return new RestTemplateBuilder().build();
    }
}
