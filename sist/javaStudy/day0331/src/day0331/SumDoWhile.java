package day0331;

import java.util.Scanner;

public class SumDoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int sum = 0;
		System.out.print("1���� ������ ���ұ��? ");
		n = sc.nextInt();
		int i = 1;
		do {
			sum += i;
			i++;
			
		} while (i<=n);
		
		System.out.println("1���� "+n+"������ ���� "+sum+"�Դϴ�.");
	}

}
