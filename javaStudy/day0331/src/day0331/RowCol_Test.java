package day0331;

import java.util.Scanner;

public class RowCol_Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows, cols;
		System.out.print("�� ���� �Է��ϼ���: ");
		rows = sc.nextInt();
		System.out.print("ĭ ���� �Է��ϼ���: ");
		cols = sc.nextInt();
		
		int i = 1;
		while (i <= rows) {
			int j=1;
			while (j<=cols) {
				System.out.print("*");
				j++;
			}
			i++;
			System.out.println();
		}

	}

}
