package day0330;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n;
		int num_cnt=0;
		System.out.print("n�� �Է��ϼ���: ");
		n = sc.nextInt();
		
		for (int i = n; i >= 1; i--) {
			if (n % i == 0) {
				num_cnt++;
			}
		}
		
		if(num_cnt==2) {
			System.out.println(n+"�� �Ҽ��Դϴ�.");
		}else {
			System.out.println(n+"�� �Ҽ��� �ƴմϴ�.");
		}
	}
}
