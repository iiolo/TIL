package day0329;

import java.util.Scanner;

public class SeasonTest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month;
		System.out.print("���� �Է��ϼ��� ==> ");
		month = sc.nextInt();
		
		if(month >= 1 && month <= 12) {
			if (month >= 3 && month <= 5) {
				System.out.println(month+"���� ���Դϴ�.");
				
			}else if (month >= 6 && month <= 8) {
				System.out.println(month+"���� �����Դϴ�.");
				
			}else if (month >= 9 && month <= 11) {
				System.out.println(month+"���� �����Դϴ�.");
				
			}else {
				System.out.println(month+"���� �ܿ��Դϴ�.");
			}
		}else {
			System.out.println("�߸��� �� �Է��Դϴ�.");
		}
	}
}
