package day0329;

import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("N�� �Է��Ͻÿ� ==> ");
		n = sc.nextInt();
		if (n >= 0) {
			System.out.println(n+100);
		} else {
			
			System.out.println(n*n);
		}
		System.out.println("�۾�����");

	}

}
