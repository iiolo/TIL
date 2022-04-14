package day0331;

import java.util.Scanner;

public class SumDoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int sum = 0;
		System.out.print("1부터 어디까지 더할까요? ");
		n = sc.nextInt();
		int i = 1;
		do {
			sum += i;
			i++;
			
		} while (i<=n);
		
		System.out.println("1부터 "+n+"까지의 합은 "+sum+"입니다.");
	}

}
