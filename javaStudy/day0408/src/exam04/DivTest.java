package exam04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivTest {

	public static void main(String[] args) {
		int a,b,div;
		
		try {
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
			div = a/b;
			System.out.println("������ ���: "+div);
		} catch (ArithmeticException e) {//� ������ ��������
			System.out.println("0���δ� ���� �� �����ϴ�.");
		} catch (InputMismatchException e) {
			System.out.println("���� ���Ŀ� ���� �ʽ��ϴ�.");
		} catch(NumberFormatException e) {
			System.out.println("���� ���Ŀ� ���� �ʽ��ϴ�.");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�������� �� ���� ������ �ּ���.");
		}
	}

}
