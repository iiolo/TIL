package exam09;

import java.io.FileWriter;

public class DivTest09 {
	public static void calcDiv(int a, int b) throws ArithmeticException {
		int div = a / b;
		System.out.println("������ ���: "+div);
		
		
	}
	
	public static void main(String[] args) {
		try {
			calcDiv(9,0);
		} catch (ArithmeticException e) {
			System.out.println("0���� ���� �� �����");
		}
		
		
	}

}
