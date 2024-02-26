package com.example.calc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculatorTests {
	
	@BeforeAll
	public static void init() {
		System.out.println("Runs before all test cases");
	}

	@BeforeEach
	public void beforeEach() {
		System.out.println("Starting test case");
	}
	
	@AfterEach
	public void afterEach() {
		System.out.println("Finished test case");
	}
	
	@AfterAll
	public static void dest() {
		System.out.println("Runs after all test cases");
	}
	
	@Test
	@DisplayName("add")
	@Tag("addition")
	void addsTwoNumbers() {
		Calculator calculator = new Calculator();
		assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
	}
	
	@DisplayName("paramTest")
	@ParameterizedTest(name = "paramTest")
	@CsvSource({
			"0,    1,   1",
			"1,    2,   3",
			"49,  51, 100",
			"1,  100, 101"
	})
	void add(int first, int second, int expectedResult) {
		Calculator calculator = new Calculator();
		assertEquals(expectedResult, calculator.add(first, second),
				() -> first + " + " + second + " should equal " + expectedResult);
	}
	
	@RepeatedTest(2)
	@DisplayName("divide")
	void divide(RepetitionInfo info) {
		System.out.println("Starting divide number: "+info.getCurrentRepetition());
		Calculator calc = new Calculator();
		assertEquals(2,calc.divide(4, 2),"4/2 should equal 2");
	}
	
	
	@Test
	@DisplayName("divide by zero")
	void divideByZero() {
		ArithmeticException exception = Assertions.assertThrows(ArithmeticException.class, ()->
		new Calculator().divide(3, 0));
		assertTrue(exception.getMessage().contains("/ by zero"));
	}
	
	@Test
	@DisplayName("divide by zero2")
	void divideByZero2() {
		assertThrows(ArithmeticException.class, ()->{new Calculator().divide(3, 0);});
	}
	
	@Test
	@Disabled("temporarily skipped")
	@DisplayName("adding negative numbers")
	void addNeg() {
		Calculator calc = new Calculator();
		assertEquals(-5, calc.add(-2, -3));
	}
}
