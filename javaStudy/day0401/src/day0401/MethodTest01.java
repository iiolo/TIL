package day0401;

public class MethodTest01 {
	
	public static void sayHello(String name) {	//�޼ҵ��� ����
		for (int i = 1; i <= 3; i++) {
			System.out.println(name+"��(��) �ȳ�");
		}
		return;
	}
	public static void main(String[] args) {
		sayHello("����");					// �޼ҵ��� ȣ��

		int year = 2022;
		System.out.println("���ش� "+year+"���� �Դϴ�.");
		sayHello("����");
	
		String title = "�ֿ뱳������";
		System.out.println(title+"���� �Ʒ� �ް� �־��!");
		sayHello("����");
		
	}

}
