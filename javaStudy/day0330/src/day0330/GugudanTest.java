package day0330;

import java.util.Scanner;

public class GugudanTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n�� �Է��ϼ��� : ");
		int n = sc.nextInt();
//		for (int i = 1; i <= 9; i++) {
//			int result = n * i;
//			System.out.println(n+" * " +i+" = "+result);
//			
//		}
		
		// Ȧ�� ������
		for (int i = 9; i >= 1; i--) {
			if(i%2 == 1) {
				System.out.println(n+" * " +i+" = "+(n*i));
			}
		}

	}

}
