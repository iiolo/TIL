package exam03;

class Person{
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}

class Student extends Person{
	String major;

	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}
	
}

public class SuperTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
