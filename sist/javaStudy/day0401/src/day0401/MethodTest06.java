package day0401;

import java.util.Scanner;

public class MethodTest06 {
	
	public static int sum(int n) {	//메소드의 정의 : 메소드 이름 옆에 return 값의 자료형 작성
		int r = 0;
		for (int i = 1; i <= n; i++) {
			r += i;
		}
		return r;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("1부터 어디까지 더할까요? : ");
		n= sc.nextInt();
		System.out.println(sum(n));
		
	}

}
