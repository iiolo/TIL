package day0330;

import java.util.Scanner;

public class NestingTable {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int line, cell;
		System.out.print("�� ���� �Է��ϼ���: ");
		line = sc.nextInt();
		System.out.print("ĭ ���� �Է��ϼ���: ");
		cell = sc.nextInt();
		
		for (int i = 1; i <= line ; i++) {
			for (int j = 1; j <=cell; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
