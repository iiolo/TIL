package day0329;

import java.util.Scanner;

public class BooleanAgeTest {

	public static void main(String[] args) {
		int age;
		boolean result;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���̸� �Է��Ͻÿ�: ");
		age = sc.nextInt();
		
		result= age >=20;
		
		System.out.println("���: "+result);
		
		

	}

}
