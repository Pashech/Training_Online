package by.epam.car.entity;

public class Wheel {
	
	private int radius;
	private int width;
	private int hight;
	
	public Wheel() {
		
	}
	
	public Wheel(int radius, int width, int hight) {
		this.radius = radius;
		this.width = width;
		this.hight = hight;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setHight(int hight) {
		this.hight = hight;
	}
	
	public int getHight() {
		return hight;
	}
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + radius;
		result = prime * result + width;
		result = prime * result + hight;
		return result;
	}
	
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Wheel other = (Wheel) obj;
		if(radius != other.radius)
			return false;
		if(width != other.width)
			return false;
		if(hight != other.hight)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Wheel [radius=" + radius + ", width=" + width + ", hight=" + hight + "]";
	}
	
	

}
