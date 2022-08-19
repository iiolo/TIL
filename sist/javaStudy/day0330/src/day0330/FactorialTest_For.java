package day0330;

import java.util.Scanner;

public class FactorialTest_For {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n;
		int result = 1;
		System.out.print("n을 입력하세요: ");
		n = sc.nextInt();
		
		for (int i = n; i >= 1; i--) {
			result *= i;
			System.out.print(i);
			if(i != 1) {
				System.out.print(" * ");
			}
		
		}
		System.out.print(" = "+result);

	}

}
