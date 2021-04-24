package com.cognizant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestCase {

    @Test
    void testInitializedWith0(){

        //Setup
        Calculator calculator;
        calculator = new Calculator();

        //Execution
        int expected = 0;
        int actual = calculator.getValue();

        //Assert
        assertEquals(expected,actual);

        //Teardown

    }
}
