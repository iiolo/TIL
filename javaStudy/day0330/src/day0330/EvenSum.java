package day0330;

import java.util.Scanner;

public class EvenSum {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n, even_cnt =0, odd_cnt = 0, even_sum = 0, odd_sum =0;
		System.out.print("어디까지 더할까요?: ");
		n = sc.nextInt();
		for (int i = 1; i <=n; i++) {
			if(i % 2 == 0) {
				even_cnt++;
				even_sum += i;
			} else {
				odd_cnt++;
				odd_sum += i;
			}
			
		}
		System.out.println();
		System.out.println("1에서 "+n+"까지의 짝수의 갯수는 " + even_cnt+ "이고 총 합은 "+even_sum+"입니다.");
		System.out.println("1에서 "+n+"까지의 홀수의 갯수는 " + odd_cnt+ "이고 총 합은 "+odd_sum+"입니다.");

	}

}
