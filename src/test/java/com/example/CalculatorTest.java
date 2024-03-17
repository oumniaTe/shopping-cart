package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
	Calculator calculator;
	@BeforeEach
	void setCalculator(){
		calculator=new Calculator();
	}
	@Test
	void testMultiply(){
		int resu=calculator.multiply(5,1);
		assertEquals(5,calculator.multiply(5,1),"error ");
		assertEquals(50,calculator.multiply(5,10),"error ");

	}

}
