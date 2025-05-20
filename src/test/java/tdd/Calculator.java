package tdd;
import org.junit.jupiter.api.Test;

import static java.lang.Long.sum;
import static org.junit.jupiter.api.Assertions.*;



public class Calculator {

    @Test
    public void testSum(){
    assertEquals(3, sum(1, 2));
    assertEquals(52, sum(50, 2));
    assertEquals(3, sum(1, 2));
    }

    private int sum(int a, int b){
        return a + b;
    }
}
