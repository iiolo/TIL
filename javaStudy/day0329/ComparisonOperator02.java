package day0329;

import java.util.Scanner;

public class ComparisonOperator02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age1, age2;
		System.out.print("ù ��° ����� ���̸� �Է� ==>");
		age1 = sc.nextInt();
		System.out.print("�� ��° ����� ���̸� �Է� ==>");
		age2 = sc.nextInt();
		
//		if(age1 == age2) {
//			System.out.println("�� ����� �����Դϴ�.");
//		}else {
//			System.out.println("�� ����� ������ �ƴմϴ�.");
//		}
		
		if(age1 != age2) {
			System.out.println("�� ����� ������ �ƴմϴ�.");
		}else {
			System.out.println("�� ����� �����Դϴ�.");
		}
	}
}
