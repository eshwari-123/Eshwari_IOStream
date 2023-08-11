package com.lambda;

public class Shape {
	
	public void calculateArea(Area area,int sides) {
		area.calculateArea(sides);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape=new Shape();
		shape.calculateArea(( sides)->{System.out.println("Area of square");
		System.out.println(sides*sides);},5);
		
	}

}
