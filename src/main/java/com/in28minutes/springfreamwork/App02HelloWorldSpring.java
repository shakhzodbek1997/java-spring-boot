package com.in28minutes.springfreamwork;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpring {
	public static void main(String[] args) {
		// 1. Launch a Spring Context
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		// 2. Configure the things that we want Spring to manage  -
		// HelloWorldConfiguration - @Configuration
		// name - @Bean

		// 3. Retrieving Beans managed by Spring
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("personcha"));
		System.out.println(context.getBean("personcha2MethodCall"));
		System.out.println(context.getBean("personcha3Param"));
		System.out.println(context.getBean("address"));
		System.out.println(context.getBean(Address.class));
		System.out.println(context.getBean("person5QualifierAddress"));
//		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
//		System.out.println(context.getBeanDefinitionCount());;
	}
}