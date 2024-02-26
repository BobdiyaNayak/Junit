package com.example.area;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AreaTests {
	
	@Test
	@DisplayName("circle area")
	void areaOfCircle() {
		Area areaOfCircle = new Area();
		double roundedArea = Math.round(areaOfCircle.circle(4) * 100.0)/100.0;
		assertEquals(50.27, roundedArea, "Area of circle should be 50.27");
	}
	
	@Test
	@DisplayName("circle assertNotEquals")
	void areaOfCircleNE() {
		Area areaOfCircle = new Area();
		double roundedArea = Math.round(areaOfCircle.circle(4) * 100.0)/100.0;
		assertNotEquals(50.28, roundedArea, "Area of circle should not be 50.28");
	}
	

}
