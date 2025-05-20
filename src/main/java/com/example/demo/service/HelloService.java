package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {//스프링이 관리해주는 객체 = bean 콩이 뜸 ultimate
    public String sayHello(){

        return "Hello SpringBoot";
    }
}
