package exam11;
class Person{
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public boolean equals(Object p) {
		boolean f = false;
		Person p2 =  (Person)p;
		
		//나의 이름과 매개변수로 전달받은 사람의 이름이 같고
		//나의 나이와 매개변수로 전달받은 사람의 나이가 같은지 판별
		//String이 같은 값인지 판별하려면 equals를 이용합니다.
		if(name.equals(p2.name) && age == p2.age) {
			f = true;
		}
		return f;
	}
}

public class EqualsTest {
	public static void main(String[] args) {		
		Person p1 = new Person("김민혁", 28);
		Person p2 = new Person("김민혁", 28);
		if(p1 == p2) {
			System.out.println("같아요");
		}else {
			System.out.println("달라요");
		}
		System.out.println("-------------------------------------");
		System.out.println("equals메소드를 이용한 비교");
		if(p1.equals(p2)) {
			System.out.println("같아요");
		}else {
			System.out.println("달라요");
		}
		
	}
}
