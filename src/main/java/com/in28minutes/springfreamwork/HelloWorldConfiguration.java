package com.in28minutes.springfreamwork;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// Eliminate verbosity in creating Java Beans
// Public accessor methods, constructor,
// equals, hashcode and toString are automatically created.
// Released in JDK 16.
record Person (String name, int age, Address manzili) { }
record Address (String firstLine, String city) { }
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
        return new Person("valijon" ,17, new Address("Shovot", "xorazm"));
    }

    @Bean
    public Person personcha2MethodCall(){
        return new Person(name(), age(), manzil()); //calling other methods: name and age
    }

    @Bean
    public Person personcha3Param(String name, int age, Address address2){
        return new Person(name, age, address2);
    }

    @Bean
    public Person person5QualifierAddress(String name, int age, @Qualifier("address2Qualifier") Address address){
        return new Person(name, age, address);
    }

    @Bean(name = "address")
    @Primary
    public Address manzil(){
        return new Address("Marki", "Warsaw");
    }
    @Bean
    @Qualifier("address2Qualifier")
    public Address address2(){
        return new Address("Chilonzor", "Yangi O'zbekiston");
    }
}
