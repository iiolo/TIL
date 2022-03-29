package day0329;

import java.util.Scanner;

public class LogicalUsingBit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		double height;
		System.out.print("나이를 입력==> ");
		age =sc.nextInt();
		System.out.print("키를 입력==> ");
		height =sc.nextDouble();
		
		if (age >= 30 & height <= 160) {
			System.out.println("입장가능");
		} else {
			System.out.println("입장불가능");
		}
	}

}
