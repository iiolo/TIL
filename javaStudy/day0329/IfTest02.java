package day0329;

import java.util.Scanner;

public class IfTest02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, max;
		System.out.print("ù ��° ���� �Է� ==> ");
		a = sc.nextInt();
		System.out.print("�� ��° ���� �Է� ==> ");
		b = sc.nextInt();
		System.out.print("�� ��° ���� �Է� ==> ");
		c = sc.nextInt();

		if (a > b) {
			if (a > c) {
				max = a;
			} else {

				max = c;
			}
		} else {
			if (b > c) {
				max = b;

			} else {

				max = c;
			}
		}
		System.out.println("���� ū ���� : " + max + "�Դϴ�.");
	}

}
