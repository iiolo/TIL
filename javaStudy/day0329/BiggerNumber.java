package day0329;

import java.util.Scanner;

public class BiggerNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, result;
		System.out.print("ù ��° ���ڸ� �Է����ּ��� ==> ");
		a = sc.nextInt();
		System.out.print("�� ��° ���ڸ� �Է����ּ��� ==> ");
		b = sc.nextInt();
		System.out.print("�� ��° ���ڸ� �Է����ּ��� ==> ");
		c = sc.nextInt();

		if (a > b) {
			if (a > c) {
				result = a;
			} else {
				result = c;
			}
		} else {
			if (b > c) {
				result = b;
			} else {
				result = c;
			}

		}

		System.out.println("���� ū ���� " + result + "�Դϴ�.");

	}

}
