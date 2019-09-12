package Lesson5HWproblem1;

public class Circle extends Shape {

	protected double radius;

	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	public double calcualteArea() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * radius;
	}

}


