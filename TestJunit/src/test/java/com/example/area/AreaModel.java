package com.example.area;

public class AreaModel {

	private double side;
	private double area;
	
	public AreaModel(double side, double area) {
		this.side = side;
		this.area = area;
	}
	
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
}
