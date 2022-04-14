package day0330;

import java.util.Scanner;

public class MonthLastDay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month, date;
		System.out.print("월을 입력하세요 ==> ");
		month = sc.nextInt();
		
		if(month <1 || month > 12) {
			System.out.println("입력범위를 넘었습니다.");
			return;
		}
		switch(month) {
		case 2: date = 28; break;  
		case 4: case 6: case 9: case 11: date = 30;
		default : date = 31;
		
		
		}
		System.out.println(month + "월은 "+date+"일까지 있어요!");
	}

}
