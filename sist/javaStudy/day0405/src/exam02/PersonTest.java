package exam02;
class Person{
	String name;		//��ü�� �����ؾ߸� �޸𸮰� ������
	int age;			//��ü�� �����ؾ߸� �޸𸮰� ������
	static String addr;
	
	public void sayHello() {
		System.out.println("�ȳ�,"+name);
	}
	
	public static void pro() {  //�� �޼ҵ�� ��ü ���̵� ȣ���� �� �־��!
		System.out.println("Person�� pro�Դϴ�.");
//		System.out.println(name);
//		System.out.println(age);
		System.out.println(addr);
		//static�޼ҵ�(Ŭ�����޼ҵ�)�ȿ����� static�ɹ�(Ŭ��������,Ŭ�����޼ҵ�)���� ������ �� �־��!
	}
	
}


public class PersonTest {
	public static void main(String[] args) {
		
		Person.pro();
		//static�޼ҵ�� ��ü�� �����ϰ� ȣ���� �� �־��
		//Ŭ�����̸����� �����մϴ�.
		
		
		Person.addr = "����� ������ ������";
		System.out.println(Person.addr);
	
		Person kim = new Person();
		Person lee = new Person();
		kim.name = "�����";
		kim.age = 28;
		lee.name = "������";
		lee.age = 26;
		
		kim.sayHello();
		lee.sayHello();
		//�Ϲ� �ɹ��޼ҵ�� �ݵ�� ��ü�� �����ϰ� �� ��ü�� ���ؼ� ����� �� �־��!
		
		
		System.out.println(kim.name+","+kim.age+","+ kim.addr);
		System.out.println(lee.name+","+lee.age+","+ lee.addr);
		
		kim.addr = "���ֵ� �������� �ֿ���";
		System.out.println(kim.addr);
		System.out.println(lee.addr);
		System.out.println(Person.addr);	
	}
}



