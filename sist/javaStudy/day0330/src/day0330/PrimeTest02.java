package day0330;

import java.util.Scanner;

public class PrimeTest02 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n;
		System.out.print("n�� �Է��ϼ���: ");
		n = sc.nextInt();
		int i;
		for (i = 2; i < n; i++) {
			if (n % i == 0) {
				//  �ϳ��� ���������� �� ������ ���� Ż��
				break;
			}
		}
		
		// ���࿡ n�� �Ҽ���� i�� n�� ���� �� �ݺ����� Ż���Ѵ�. �߰��� �������� �� �� ���� ���� ����
		
		if(i == n) {
			System.out.println(n+"�� �Ҽ��Դϴ�.");
		}else {
			System.out.println(n+"�� �Ҽ��� �ƴմϴ�.");
		}

	}

}
