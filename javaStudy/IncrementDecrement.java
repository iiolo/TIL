package day0329;

public class IncrementDecrement {

	public static void main(String[] args) {
//		int a = 5;
//		int b = 5;
//		a++; // a=a+1
//		b--; // b = b-1
//		
//		System.out.println(a);
//		System.out.println(b);
		
//		// ���� ������ ��ġ
//		int a =5;
//		int b =5;
//		++a;//a = a+1
//		--a;//b =b-1
//		System.out.println(a);
//		System.out.println(a);
		
		// ���������ڿ� �ٸ� �����ڰ� ���� ���� ���
		int a = 5;
		int b = 5;
		
		// ���� �����ڿ� ���Կ����ڰ� �Բ� ���̴� ���
		int i = a++; // ���������ڰ� ���� �� �ڿ� ���� ��� ���� ������ ���� ó���ϰ� ���������� ó�� 
		int j = ++b; // ���������ڰ� ���� �� �տ� ���� ��� ���������� ���� ó���ϰ� ���� ������ ó�� 
		
		System.out.println("a : "+a); //6
		System.out.println("b : "+b); //6
		System.out.println("i : "+i); //5
		System.out.println("j : "+j); //6
	}

}
