//Exam01.plusOne(age); �ڵ�������� 29�� �����µ� �³���?


package exam04;
class Exam01{	
	//������ ���� �ϳ��� �Ű������� ���޹޾� 1���� ��Ű�� �޼ҵ带 ����
	public static void plusOne(int n) {
		n = n + 1;
		System.out.println(n);
		System.out.println("�޼ҵ� �ȿ��� ���� �����Ͽ����ϴ�.");
		System.out.println();
	}
}

public class CallByValueTest {
	public static void main(String[] args) {
		int age;
		age = 28;
		Exam01.plusOne(age);
		System.out.println("����:"+age);
		System.out.println("�׷��� �޼ҵ� ȣ���ϴ� �ʿ����� ����� ������ ������� �ʾƿ�!");
	}
}
