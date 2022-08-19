package exam05;

public class Person {
	private String name;
	private int age;

	// 생성자 constructor
	public Person(String n, int a) {
		name = n;
		age = a;
	}

	public Person() {
		name = "홍길동";
		age = 20;
	}

	public Person(String n) {
		name = n;
		age = 20;
	}

	public Person(int a) {
		name = "홍길동";
		age = a;
	}

	// 접근명시자 반환값자료형 메소드이름(입력값){}
	// setter
	public void setName(String n) {
		name = n;

	}

	public void setAge(int a) {

		age = a;
	}

	// getter
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void eat(String food) {
		System.out.println(age + "살 " + name + "이(가) " + food + "를(을) 먹어요");
	}

	public void wash(String soap) {
		System.out.println(age + "살 " + name + "이(가) " + soap + "으로 씻어요");

	}

}
