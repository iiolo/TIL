package day0331;

import java.util.Scanner;

public class FactorialTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int sum = 1;
		System.out.println("N을 입력하세요 ==> ");
		n = sc.nextInt();
		int i = n;
		while(i>=1) {
			sum *= i;
			System.out.print(i);
			if (i != 1) {
				System.out.print("*");
			}
			i--; // i = i - 1
		}
		
		System.out.println("=" + sum);
	}

}
