package com.example.area;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AreaTests {

	@Test
	@DisplayName("areaOfCircle")
	void areaOfCircle() {
		Area areaOfCircle = new Area();
		double roundedArea = Math.round(areaOfCircle.circle(4) * 100.0)/100.0;
		assertEquals(50.27, roundedArea, "Area of circle should be 50.26");
	}

}
