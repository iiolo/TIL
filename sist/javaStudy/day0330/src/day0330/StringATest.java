package day0330;

import java.util.Scanner;

public class StringATest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String data;
		int sum = 0;
		System.out.print("���ڿ��� �Է��ϼ���: ");
		data = sc.next();
		for (int i = 0; i < data.length(); i++) {
			char ch = data.charAt(i);

			if (ch == 'a') {
				sum++;
			}
			

		}
		System.out.println("�ҹ��� a�� " + sum + "�� �Դϴ�.");

	}
}
