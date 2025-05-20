package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssertJTest {
    @Test
    public void test() {
        int a = 3;
        int b = 1;
        int result = 4;

        assertEquals(result, a+b);
    }
}
