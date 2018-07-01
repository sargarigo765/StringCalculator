package calc;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class FibonacciTest {
    @Test
    public void testFibonacci() {
        Fibonacci myFibonacci = new Fibonacci();
        assertEquals(myFibonacci.fibonacci(0), 0);
        assertEquals(myFibonacci.fibonacci(1), 1);
        assertEquals(myFibonacci.fibonacci(2), 1);
        assertEquals(myFibonacci.fibonacci(3), 2);
    }
}

