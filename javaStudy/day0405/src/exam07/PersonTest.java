package exam07;

class Person{
	public Person() {
		System.out.println("Person�� ������ ������!");
	}
}

class Customer extends Person{
	public Customer() {
		//super(); �θ��� �⺻�����ڸ� �䱸�ϴ� ����� �����Ǿ��ֽ��ϴ�.
		System.out.println("Customer�� ������ ������.");
	}
}

public class PersonTest {
	public static void main(String[] args) {
		Customer c = new Customer();
	}
}
