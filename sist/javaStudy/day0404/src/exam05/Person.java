package exam05;

public class Person {
	private String name;
	private int age;

	// ������ constructor
	public Person(String n, int a) {
		name = n;
		age = a;
	}

	public Person() {
		name = "ȫ�浿";
		age = 20;
	}

	public Person(String n) {
		name = n;
		age = 20;
	}

	public Person(int a) {
		name = "ȫ�浿";
		age = a;
	}

	// ���ٸ���� ��ȯ���ڷ��� �޼ҵ��̸�(�Է°�){}
	// setter
	public void setName(String n) {
		name = n;

	}

	public void setAge(int a) {

		age = a;
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
