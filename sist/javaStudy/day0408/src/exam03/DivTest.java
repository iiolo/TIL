package exam03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivTest {

	public static void main(String[] args) {
		int a,b,div;
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("ù ��° ���� �Է��ϼ���: ");
			a = sc.nextInt();
			System.out.print("�� ��° ���� �Է��ϼ���: ");
			b = sc.nextInt();
			div = a/b;
			System.out.println("������ ���: "+div);
		} catch (ArithmeticException e) {//� ������ ��������
			System.out.println("0���δ� ���� �� �����ϴ�.");
		} catch (InputMismatchException e) {
			System.out.println("���� ���Ŀ� ���� �ʽ��ϴ�.");
		}
	}

}
