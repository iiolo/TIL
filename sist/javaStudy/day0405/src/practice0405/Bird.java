package practice0405;

class Animal {
	void walk() {
		System.out.println("���� �� ����");
	}

}

public class Bird extends Animal {
	void fly() {
		System.out.println("���� �� ����");
	}

	void sing() {
		System.out.println("�뷡 �θ� �� ����");
	}

	public static void main(String[] args) {
		Bird b = new Bird();
		b.fly();
		b.walk();
		b.sing();

	}

}
