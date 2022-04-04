package exam04;

public class Person {
	private String name;
	private int age;
	
	
	// 생성자 constructor
	public Person() {
		name = "김민혁";
		age = 25;
		System.out.println("생성자가 동작하였습니다.");
	}
	
	
	//접근명시자 반환값자료형 메소드이름(입력값){}
	// setter
	public void setName(String n) {
		name = n;
	}
	
	public void setAge(int a) {
		age = a;
	}
	
	//getter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	
	public void eat(String food) {
		System.out.println(age+"살 "+name+"이(가) "+food+"를(을) 먹어요");
	}

	public void wash(String soap) {
		System.out.println(age+"살 "+name+"이(가) "+soap+"으로 씻어요");
		
	}
	
	
}
