package day0331;

import java.util.Scanner;

public class RowCol_Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows, cols;
		System.out.print("줄 수를 입력하세요: ");
		rows = sc.nextInt();
		System.out.print("칸 수를 입력하세요: ");
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
