package day0401;

public class MethodTest03 {
	
	public static void gugudan(int n) {	//�޼ҵ��� ����
		System.out.println("*** "+n+"�� ***");
		for (int i = 1; i <= 9; i++) {
			System.out.println(n+" * "+i+" = "+n*i);
		}
		System.out.println("------------------------------");
		return;
	}
	public static void main(String[] args) {
		gugudan(7);
		gugudan(2);
		
	}

}
