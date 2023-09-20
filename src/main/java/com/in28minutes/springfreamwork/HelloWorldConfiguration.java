package com.in28minutes.springfreamwork;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Eliminate verbosity in creating Java Beans
// Public accessor methods, constructor,
// equals, hashcode and toString are automatically created.
// Released in JDK 16.
record Person (String name, int age) { };
record Address (String firstLine, String city) { };
@Configuration

public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "Shakhzod";
    }
    @Bean
    public int age(){
        return 26;
    }
    @Bean
    public Person personcha(){
        return new Person("valijon" ,17);
    }

    @Bean
    public Address manzil(){
        return new Address("Marki", "Warsaw");
    }
}
