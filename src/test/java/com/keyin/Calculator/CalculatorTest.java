package com.keyin.Calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private final Calculator calculatorUnderTest = new Calculator();

    @Test
    public void testAdd() {
        int resultOne = calculatorUnderTest.add(2, 5);
        Assertions.assertEquals(7, resultOne);

        Assertions.assertNotEquals(23, calculatorUnderTest.add(5, 3));
        Assertions.assertEquals(26, calculatorUnderTest.add(20,6));
    }

    @Test
    public void testSub(){
        Assertions.assertEquals(6, calculatorUnderTest.sub(9,3));

        Assertions.assertNotEquals(45, calculatorUnderTest.sub(90,10));
        Assertions.assertEquals(45,calculatorUnderTest.sub(50,5));
    }
    @Test
    public void testMult(){
        Assertions.assertEquals(25,calculatorUnderTest.mult(5,5));

        Assertions.assertNotEquals(56, calculatorUnderTest.mult(6,8));
        Assertions.assertEquals(30,calculatorUnderTest.mult(6,5));
    }

    @Test
    public void testDivide(){
        Assertions.assertEquals(4, calculatorUnderTest.divide(8,2));

        Assertions.assertNotEquals(10, calculatorUnderTest.divide(5,2));
        Assertions.assertEquals(8, calculatorUnderTest.divide(48,6));

    }

}
