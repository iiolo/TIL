package day0329;


import java.util.Scanner;

public class MonthSeason {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month;
		String result = "";
		System.out.print("���� �Է��ϼ��� ==> ");
		month = sc.nextInt();
		
		if (month>2 ) {
			result = "��";
		} else if (month > 5) {
			result = "����";
			
		} else if (month > 8) {
			result = "����";
			
		} else if(month > 11 || month >= 1) {
			
			result = "�ܿ�";
		} else if(month > 12 || month < 1) {
			System.out.println("�ش� ���� �����ϴ�.");
		}
		
		System.out.println(month + "���� "+result+"�Դϴ�.");
		
		
	}

}
