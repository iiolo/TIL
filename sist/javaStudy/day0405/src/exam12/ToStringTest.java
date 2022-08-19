package exam12;

import java.util.Objects;

class Person{
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
	
}


public class ToStringTest {
	public static void main(String[] args) {	
		Person kim = new Person("김민혁", 28);
		Person kim2 = new Person("김민혁", 28);
		System.out.println(kim);
//		exam12.Person@1c4af82c
//		주소말고 그 객체가 갖고 있는 속성들을 출력하고 싶어요!
// 			그렇게 하려면 자바조상의 제일 조상클래스인 Object의 toString을
//			나한테 맞게 재정의 합니다.
//			출력문에 객체를 표현하면 toString이 자동으로 동작합니다.
		
		if(kim.equals(kim2)) {
			System.out.println("같아요");
		}else {
			System.out.println("달라요");
		}
	}
}
