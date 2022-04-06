package practice0405;

class Animal {
	void walk() {
		System.out.println("걷을 수 있음");
	}

}

public class Bird extends Animal {
	void fly() {
		System.out.println("날을 수 있음");
	}

	void sing() {
		System.out.println("노래 부를 수 있음");
	}

	public static void main(String[] args) {
		Bird b = new Bird();
		b.fly();
		b.walk();
		b.sing();

	}

}
