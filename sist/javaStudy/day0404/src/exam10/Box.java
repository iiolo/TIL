package exam10;

public class Box {
	private double width;
	private double length;
	private double height;
	private double volume;
	
	
	//constructor
	public Box() {
		this(10,10,10);//밑에 매개변수를 필요로 하는 생성자를 this()로 불러옴
		System.out.println("매개변수가 없는 생성자가 동작하였습니다.");
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
