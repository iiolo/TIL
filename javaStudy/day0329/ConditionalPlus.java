package day0329;

import java.util.Scanner;

public class ConditionalPlus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, result;
		
		System.out.print("숫자를 입력해주세요 ==> ");
		n = sc.nextInt();
		
		if (n>=0) {
			result = n + 100;
			System.out.println(result +", 작업종료");
		} else {

			result = n * n;
			System.out.println(result +", 작업종료");

		}
		

	}

}
