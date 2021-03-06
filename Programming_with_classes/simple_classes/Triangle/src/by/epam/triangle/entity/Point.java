package by.epam.triangle.entity;

public class Point {
	
	private double x;
	private double y;
	
	public Point() {
		super();
	}
	
	public Point(double x, double y) {
		super();
		
		this.x = x;
		this.y = y;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public double getX() {
		return x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public double getY() {
		return y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	

}
