package exam12;

import java.util.Objects;

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		super();
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

public class ToStringTo {

	public static void main(String[] args) {
		Person kim = new Person("±Ëº“¿±", 25);
		Person kim2 = new Person("±Ëº“¿±", 25);
		System.out.println(kim);
		if (kim.equals(kim2)) {
			System.out.println("∞∞æ∆ø‰");
		} else {
			System.out.println("¥ﬁ∂Ûø‰");

		}

	}

}
