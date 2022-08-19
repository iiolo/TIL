package day0330;

import java.util.Scanner;

public class NestingTable {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int line, cell;
		System.out.print("줄 수를 입력하세요: ");
		line = sc.nextInt();
		System.out.print("칸 수를 입력하세요: ");
		cell = sc.nextInt();
		
		for (int i = 1; i <= line ; i++) {
			for (int j = 1; j <=cell; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
