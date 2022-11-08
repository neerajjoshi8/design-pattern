package com.designpattern.factory;

public class ShapeFactoryTest {

	public static void main(String[] args) {
		Shape rectangle = ShapeFactory.create("rectangle");
		rectangle.draw();

		Shape square = ShapeFactory.create("square");
		square.draw();

		Shape triangle = ShapeFactory.create("triangle");
		triangle.draw();

		Shape circle = ShapeFactory.create("circle");
		circle.draw();
		
		Shape random = ShapeFactory.create("random");	// returns null
		random.draw();
	}

}
