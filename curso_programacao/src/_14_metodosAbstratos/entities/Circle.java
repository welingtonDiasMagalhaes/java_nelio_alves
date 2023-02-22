package _14_metodosAbstratos.entities;

public class Circle extends Shape {
	private double radius;	
	
	//private double PI = 3.1415;

	public Circle(_14_metodosAbstratos.entities.Color color) {
		super(color);
	}	
	
	public Circle(_14_metodosAbstratos.entities.Color color, double radius) {
		super(color);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {		
		return Math.PI * radius * radius;
	}

}
