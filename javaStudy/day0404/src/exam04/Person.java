package exam04;

public class Person {
	private String name;
	private int age;
	
	
	// ������ constructor
	public Person() {
		name = "�����";
		age = 25;
		System.out.println("�����ڰ� �����Ͽ����ϴ�.");
	}
	
	
	//���ٸ���� ��ȯ���ڷ��� �޼ҵ��̸�(�Է°�){}
	// setter
	public void setName(String n) {
		name = n;
	}
	
	public void setAge(int a) {
		age = a;
	}
	
	//getter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	
	public void eat(String food) {
		System.out.println(age+"�� "+name+"��(��) "+food+"��(��) �Ծ��");
	}

	public void wash(String soap) {
		System.out.println(age+"�� "+name+"��(��) "+soap+"���� �ľ��");
		
	}
	
	
}
