package day0329;

import java.util.Scanner;

public class IfTest02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, max;
		System.out.print("첫 번째 수를 입력 ==> ");
		a = sc.nextInt();
		System.out.print("두 번째 수를 입력 ==> ");
		b = sc.nextInt();
		System.out.print("세 번째 수를 입력 ==> ");
		c = sc.nextInt();

		if (a > b) {
			if (a > c) {
				max = a;
			} else {

				max = c;
			}
		} else {
			if (b > c) {
				max = b;

			} else {

				max = c;
			}
		}
		System.out.println("가장 큰 수는 : " + max + "입니다.");
	}

}
