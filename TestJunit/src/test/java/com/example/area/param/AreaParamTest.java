package com.example.area.param;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import com.example.area.Area;
import com.example.area.AreaModel;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AreaParamTest {
	
	@ParameterizedTest
	@MethodSource("initializeParams")
	@DisplayName("parametrized test ex2")
	void areaOfSquare(AreaModel areaModel) {
		System.out.println("Paramertized test for calculating area of square");
		Area area = new Area();
		assertEquals(areaModel.getArea(), area.square(areaModel.getSide()),"Area of square was not equal to expected value");
	}
	
	private static List<AreaModel> initializeParams() {
		List<AreaModel> params = new ArrayList<>();
		System.out.println("Initializing parameters");
		params.add(new AreaModel(2, 4));
		params.add(new AreaModel(3, 9));
		return params;
	}
}
