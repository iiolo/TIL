package day0401;

public class MethodTest04 {
	
	public static void max(int a, int b) {	//�޼ҵ��� ����
		int r;
		if (a>b) {
			r=a;
		} else {
			r=b;
		}
		System.out.println("ū ���� "+r+"�Դϴ�.");
		System.out.println("------------------------------");
		return;
	}
	public static void main(String[] args) {
		max(7,5);
		max(2,3);
		
	}

}
