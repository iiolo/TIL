package exam08;

public class Person {
	private String name;
	private int age;

	// ������ constructor
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Person() {
		name = "ȫ�浿";
		age = 20;
	}

	public Person(String name) {
		this.name = name;
		this.age = 20;
	}

	public Person(int age) {
		this.name = "ȫ�浿";
		this.age = age;
	}

	// ���ٸ���� ��ȯ���ڷ��� �޼ҵ��̸�(�Է°�){}
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
		System.out.println(age + "�� " + name + "��(��) " + food + "��(��) �Ծ��");
	}

	public void wash(String soap) {
		System.out.println(age + "�� " + name + "��(��) " + soap + "���� �ľ��");

	}

}
