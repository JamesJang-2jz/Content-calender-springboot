package com.jamescalenderdemo.contentcalenderdemo.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;


// @Component
// COMMAND LINE RUNNER IS FUNCTIONAL INTERFACE, CAN BE USED WITH LAMBDA
public class DataLoader implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        
        System.out.println("Hello James");
    }


    
}
