package day0329;

import java.util.Scanner;

public class BooleanTest02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.print("���̸� �Է��ϼ���: ");
		age = sc.nextInt();
		
		boolean flag;
		flag = age >= 20;
		System.out.println(flag);

	}

}
