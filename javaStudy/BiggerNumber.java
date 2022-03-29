package day0329;

import java.util.Scanner;

public class BiggerNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, result;
		System.out.print("첫 번째 숫자를 입력해주세요 ==> ");
		a = sc.nextInt();
		System.out.print("두 번째 숫자를 입력해주세요 ==> ");
		b = sc.nextInt();
		System.out.print("세 번째 숫자를 입력해주세요 ==> ");
		c = sc.nextInt();

		if (a > b) {
			if (a > c) {
				result = a;
			} else {
				result = c;
			}
		} else {
			if (b > c) {
				result = b;
			} else {
				result = c;
			}

		}

		System.out.println("가장 큰 수는 " + result + "입니다.");

	}

}
