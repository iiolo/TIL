package exam04;

class Person{
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
class Exam03{
	//Person객체를 매개변수로 전달받아 나이를 1증가하는 메소드를 정의
	public static void plusOne(Person p) {
		p.age++;
		System.out.println("메소드 안에서 출력");
		System.out.println(p.name + ","+ p.age);
		System.out.println();
	}
}
public class CallByReferenceTest02 {
	public static void main(String[] args) {
		Person kim = new Person("김민혁", 28);	
		System.out.println("메소드 호출하기전");
		System.out.println(kim.name + ","+kim.age);
		System.out.println();
		Exam03.plusOne(kim);		
		System.out.println("메소드 호출 한 후");
		System.out.println(kim.name + ","+kim.age);
		System.out.println();
		
		
			
	}	
}

















