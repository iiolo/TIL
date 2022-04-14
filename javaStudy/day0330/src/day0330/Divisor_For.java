package day0330;

import java.util.Scanner;

public class Divisor_For {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n;
		System.out.print("n을 입력하세요: ");
		n = sc.nextInt();
		
		for (int i = n; i >= 1; i--) {
			if (n % i == 0) {
				System.out.print((n/i)+ " ");
			}
		}
	}

}
