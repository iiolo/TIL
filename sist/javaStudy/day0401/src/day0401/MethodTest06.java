package day0401;

import java.util.Scanner;

public class MethodTest06 {
	
	public static int sum(int n) {	//�޼ҵ��� ���� : �޼ҵ� �̸� ���� return ���� �ڷ��� �ۼ�
		int r = 0;
		for (int i = 1; i <= n; i++) {
			r += i;
		}
		return r;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("1���� ������ ���ұ��? : ");
		n= sc.nextInt();
		System.out.println(sum(n));
		
	}

}
