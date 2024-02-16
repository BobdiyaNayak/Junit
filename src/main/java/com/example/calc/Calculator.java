/*
 * Copyright 2015-2023 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package com.example.calc;

public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}
	
	public int divide(int a, int b) {
		return a/b;
	}
	
	public double sqrt(double a) {
		return Math.sqrt(a);
	}
	
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.divide(2, 0);
	}
	
}
