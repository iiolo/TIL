package day0330;

import java.util.Scanner;

public class Practice_0330 {

	public static void main(String[] args) {
		// 3
		for (int i = 1; i <= 50; i++) {
			if (i == 3 || i == 6 || i == 9) {
				System.out.print("짝 ");
			} else {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("------------------------------------------");
		
		//4
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 || i % 4 == 0) {
				sum += i;
			}
		}

		System.out.println("3 또는 4의 배수의 합= " + sum);
		System.out.println("------------------------------------------");
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <=6; j++) {
				if(i+j == 6) {
					System.out.println("("+i+", "+j+")");
				}
			}
		}
		
		System.out.println("------------------------------------------");
		//6
//		int x, y;
//		if (x >= 0 && x <=10 && y >= 0 && y <= 10) {
//			
//		} 
		System.out.println("------------------------------------------");
		
		//7
		boolean isPrimeNumber = true;
		for (int i = 2; i <=100; i++) {
			for (int j = 2; j <= i; j++) {
				if (i%j == 0) {
					isPrimeNumber = false;
					break;
					
				}
				
				
			}
			if (isPrimeNumber = true) {
				System.out.println(i);
			}
			
		}
	}
}
