package exam05;

import java.util.Scanner;

public class DivTest05 {

	public static void main(String[] args) {
		int a,b,div;
		
		try {
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
			div = a/b;
			System.out.println("������ ���: "+div);
		} 
		catch (ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}catch (Exception e) {
			System.out.println("�ϴ����� �� ���� ������ ���� �� �ּ���"); // 0���� ������ �� ������ ���� �����ϰ� ������ ��� �̸�ɾ�� ó��
		} 
	}

}
