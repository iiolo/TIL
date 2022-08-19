package exam05;

public class PersonTest {

	public static void main(String[] args) {
		// 생성자
		Person p1 = new Person();
		Person p2 = new Person("이순신", 30);
		Person p3 = new Person("이순신");
		Person p4 = new Person(30);
		
		p1.eat("라면");
		p2.eat("라면");
		p3.eat("라면");
		p4.eat("라면");
		
	}

}
