package com.example.calc.adv;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.calc.Calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AdvCalculatorTest {
 
	@Test
	@DisplayName("Square root")
	void sqrt() {
		Calculator calc = new Calculator();
		assertEquals(4, calc.sqrt(16));
	}

}
