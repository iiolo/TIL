package exam02;

public class Rectangle {
	private double width;
	private double length;
	
	public void setWidth(double w) {
		width = w;
	}
	public void setLength(double l) {
		length = l;
	}
	
	public double getWidth() {
		return width;
	}
	public double getLength() {
		return length;
	}
	
	public double calcArea() {
		return width*length;
	}
}
