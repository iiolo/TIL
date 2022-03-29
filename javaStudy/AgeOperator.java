package day0329;

import java.util.Scanner;

public class AgeOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 ==-> ");
		int age = sc.nextInt();
		String result="";
		if(age >= 20) {
			result = "입장가능";
		}else {
			result = "입장불가능";
		}
		
		System.out.println(result);

	}

}
