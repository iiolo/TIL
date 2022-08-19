package day0330;

import java.util.Scanner;

public class NumberTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("n을 입력하세요 : ");
		n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println(i);
		}

	}

}
