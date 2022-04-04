package exam08;

public class Person {
	private String name;
	private int age;

	// 생성자 constructor
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Person() {
		name = "홍길동";
		age = 20;
	}

	public Person(String name) {
		this.name = name;
		this.age = 20;
	}

	public Person(int age) {
		this.name = "홍길동";
		this.age = age;
	}

	// 접근명시자 반환값자료형 메소드이름(입력값){}
	// setter
	public void setName(String name) {
		this.name = name;

	}

	public void setAge(int age) {

		this.age = age;
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
