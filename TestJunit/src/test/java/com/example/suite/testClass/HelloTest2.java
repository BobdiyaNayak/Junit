package com.example.suite.testClass;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class HelloTest2 {

	@Test
	public void hello2() {
		System.out.println("Hello from here!!");
	}
	
	@Test
	public void assertFalseTest() {
		assertFalse("Hello".equalsIgnoreCase("Bye"));
	}
}
