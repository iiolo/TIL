package exam01;

public class Person {
	private String name;
	private int age;
	
	//���ٸ���� ��ȯ���ڷ��� �޼ҵ��̸�(�Է°�){}
	public void setName(String n) {
		name = n;
	}
	
	public void setAge(int a) {
		age = a;
	}
	
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
