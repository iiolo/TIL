package day0330;

import java.util.Scanner;

public class PrimeTest02 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n;
		System.out.print("n을 입력하세요: ");
		n = sc.nextInt();
		int i;
		for (i = 2; i < n; i++) {
			if (n % i == 0) {
				//  하나라도 나누어지는 게 있으면 루프 탈출
				break;
			}
		}
		
		// 만약에 n이 소수라면 i는 n과 같을 때 반복문을 탈출한다. 중간에 나눠지는 게 한 개도 없기 때문
		
		if(i == n) {
			System.out.println(n+"은 소수입니다.");
		}else {
			System.out.println(n+"은 소수가 아닙니다.");
		}

	}

}
