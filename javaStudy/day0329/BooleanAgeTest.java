package day0329;

import java.util.Scanner;

public class BooleanAgeTest {

	public static void main(String[] args) {
		int age;
		boolean result;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하시오: ");
		age = sc.nextInt();
		
		result= age >=20;
		
		System.out.println("결과: "+result);
		
		

	}

}
