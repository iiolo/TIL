package exam02;

class Person{
	String name = "ȫ�浿";
	int age = 20;
	final static String ADDR = "����� ������ ������";
	//final�� ������ ���ٲٴ� ���̶�
	//��ü���� ���� �޸𸮸� ���� �ʿ䰡 �����
	//�׷��� final �̸� static���� ���� 
	//��� ��ü�� ���� ����մϴ�.
}

public class FinalTest01 {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.age = 21;
		p2.age = 31;
		
//		p1.ADDR = "���ֵ� ��������";
//		p2.ADDR = "��⵵ ���ֽ�";
		//addr�� ����̱� ������ �����Ͽ� ���� �����ų �� �����!
		
	}
}