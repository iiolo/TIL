package exam09;

public class Box {
	private double width;
	private double length;
	private double height;
	private double volume;
	
	
	//constructor
	public Box() {
		width = 0;
		length = 0;
		height = 0;
	}
	
	public Box(double width, double length, double height) {
		this.width = width;
		this.length = length;
		this.height = height;
		
	}
	
	//setter
	public void setWidth(double width) {
		this.width = width;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	//getter
	public double getWidth() {
		return width;
	}
	public double getLength() {
		return length;
	}
	public double getHeight() {
		return height;
	}
	
	
	public void calVolume() {
		volume = width * length * height;
		
	}
	
	public double getVolume() {
		return volume;
	}
	
	
	
	
	
	
}
