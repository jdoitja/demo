package com.example.demo.lombok;

import org.junit.jupiter.api.Test;

import java.util.List;

class PersonTest {
    @Test
    public void test() {
        Person person = new Person();
        person.setId(123L);
        person.setName("Anything");
        person.setAge(20);
        person.setHobbies(List.of("줄넘기", "달리기"));

        person.getId();
        person.getName();
        person.getAge();
        person.getHobbies();
    }
}