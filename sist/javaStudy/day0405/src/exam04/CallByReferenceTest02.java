package exam04;

class Person{
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
class Exam03{
	//Person��ü�� �Ű������� ���޹޾� ���̸� 1�����ϴ� �޼ҵ带 ����
	public static void plusOne(Person p) {
		p.age++;
		System.out.println("�޼ҵ� �ȿ��� ���");
		System.out.println(p.name + ","+ p.age);
		System.out.println();
	}
}
public class CallByReferenceTest02 {
	public static void main(String[] args) {
		Person kim = new Person("�����", 28);	
		System.out.println("�޼ҵ� ȣ���ϱ���");
		System.out.println(kim.name + ","+kim.age);
		System.out.println();
		Exam03.plusOne(kim);		
		System.out.println("�޼ҵ� ȣ�� �� ��");
		System.out.println(kim.name + ","+kim.age);
		System.out.println();
		
		
			
	}	
}

















