package exam11;

public class Box {
	private double width;
	private double length;
	private double height;
	private double volume;
	
	public void calcVolume() {
		volume = width * length * height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getVolume() {
		return volume;
	}
	
	public Box(double width, double length, double height) {
		this.width = width;
		this.length = length;
		this.height = height;
		
	}
	
	public Box() {
		this(10,10,10);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
