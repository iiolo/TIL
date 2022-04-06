package practice0405;

class Circle {
	protected int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

}

public class Pizza extends Circle {
	String type;

	public Pizza(String type, int radius) {
		super(radius);
		this.type = type;
	}

	public void print() {
		System.out.println("피자의 종류: " + type + ", 피자의 크기: " + radius);
	}

	public static void main(String[] args) {
		Pizza obj = new Pizza("Pepperoni", 20);
		obj.print();

	}

}
