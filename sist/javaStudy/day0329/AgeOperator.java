package day0329;

import java.util.Scanner;

public class AgeOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���̸� �Է��ϼ��� ==-> ");
		int age = sc.nextInt();
		String result="";
		if(age >= 20) {
			result = "���尡��";
		}else {
			result = "����Ұ���";
		}
		
		System.out.println(result);

	}

}
