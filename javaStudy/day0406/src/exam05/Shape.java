package exam05;

abstract class TwoDim {
	protected int x;
	protected int y;
	protected double area;

	public TwoDim(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public abstract void calcArea();

	@Override
	public String toString() {
		return "x=" + x + ", y=" + y + ", area=" + area;
	}

	
}

class Rectangle extends TwoDim {
	private double width;
	private double height;

	public Rectangle(int x, int y, double width, double height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	public void calcArea() {
		area = width * height;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + super.toString() + "]";
	}
	
	
}

class Triangle extends TwoDim {
	private double width;
	private double height;

	public Triangle(int x, int y, double width, double height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	public void calcArea() {
		area = width * height / 2;
	}

	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height +  super.toString() + "]";
	}
	
	
}

class Circle extends TwoDim {
	private double radius;

	public Circle(int x, int y, double radius) {
		super(x, y);
		this.radius = radius;
	}

	public void calcArea() {
		area = Math.PI * Math.pow(radius, 2) / 2;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + super.toString() + "]";
	}
	
	
}

public class Shape {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(10,10,50,20);
		Triangle t = new Triangle(10,50,50,20);
		Circle c = new Circle(10,100,20);
		
		r.calcArea();
		t.calcArea();
		c.calcArea();
		
		System.out.println(r);
		System.out.println(t);
		System.out.println(c);
		

	}

}
