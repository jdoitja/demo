package com.example.demo;

import org.junit.jupiter.api.*;

public class JUnitTotalTest {
    @BeforeAll
    public static void beforeAll(){
        System.out.println("@BeforeAll");
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("@beforeEach");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("@afterEach");
    }

    @Test
    public void test(){
        System.out.println("test1");
    }

    @Test
    public void test2(){
        System.out.println("test2");
    }

    @Test
    public void test3(){
        System.out.println("test3");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("@AfterAll");
    }




}
