package exam07;


public class DivTest07 {
	public static void calcDiv(int a, int b) {
		try {
			int div = a / b;
			System.out.println("������ ���: "+div);
		} catch (ArithmeticException e) {
			System.out.println("0���� ���� ���� �����");
		}
		
	}
	public static void main(String[] args) {
		calcDiv(9,0);
		
	}

}
