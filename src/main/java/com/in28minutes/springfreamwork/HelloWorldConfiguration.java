package com.in28minutes.springfreamwork;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "Shakhzod";
    }
}
