package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
@SpringBootApplication
@PropertySource("classpath:/application.properties")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	ApplicationContext context = new AnnotationConfigApplicationContext(DemoApplication.class);
	String[] beanList = context.getBeanDefinitionNames();
	System.out.println("==스프링 빈 목록");
	Arrays.stream(beanList).forEach(System.out::println);

	}
}
