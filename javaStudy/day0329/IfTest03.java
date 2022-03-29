package day0329;

import java.util.Scanner;

public class IfTest03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("N을 입력하세요 ==> ");
		n = sc.nextInt();
		if (n>0) {
			System.out.println("양수");
		} else if (n < 0) {
			System.out.println("음수");
			
		} else {

			System.out.println("영");
		}

	}

}
