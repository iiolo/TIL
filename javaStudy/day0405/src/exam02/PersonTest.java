package exam02;
class Person{
	String name;		//객체를 생성해야만 메모리가 잡혀요
	int age;			//객체를 생성해야만 메모리가 잡혀요
	static String addr;
	
	public void sayHello() {
		System.out.println("안녕,"+name);
	}
	
	public static void pro() {  //이 메소드는 객체 없이도 호출할 수 있어요!
		System.out.println("Person의 pro입니다.");
//		System.out.println(name);
//		System.out.println(age);
		System.out.println(addr);
		//static메소드(클래스메소드)안에서는 static맴버(클래스변수,클래스메소드)에만 접근할 수 있어요!
	}
	
}


public class PersonTest {
	public static void main(String[] args) {
		
		Person.pro();
		//static메소드는 객체와 무관하게 호출할 수 있어요
		//클래스이름으로 접근합니다.
		
		
		Person.addr = "서울시 마포구 서교동";
		System.out.println(Person.addr);
	
		Person kim = new Person();
		Person lee = new Person();
		kim.name = "김민혁";
		kim.age = 28;
		lee.name = "이진주";
		lee.age = 26;
		
		kim.sayHello();
		lee.sayHello();
		//일반 맴버메소드는 반드시 객체를 생성하고 그 객체를 통해서 사용할 수 있어요!
		
		
		System.out.println(kim.name+","+kim.age+","+ kim.addr);
		System.out.println(lee.name+","+lee.age+","+ lee.addr);
		
		kim.addr = "제주도 서귀포시 애월읍";
		System.out.println(kim.addr);
		System.out.println(lee.addr);
		System.out.println(Person.addr);	
	}
}



