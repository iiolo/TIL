package day0401;

public class MethodTest02 {
	
	public static void sayHello(String name, int n) {	//�޼ҵ��� ����
		for (int i = 1; i <= n; i++) {
			System.out.println(name+"��(��) �ȳ�");
		}
		return;
	}
	public static void main(String[] args) {
		sayHello("����",10);					// �޼ҵ��� ȣ��

		int year = 2022;
		System.out.println("���ش� "+year+"���� �Դϴ�.");
		sayHello("����",5);
	
		String title = "�ֿ뱳������";
		System.out.println(title+"���� �Ʒ� �ް� �־��!");
		sayHello("����", 2);
		
	}

}
