package day0329;


import java.util.Scanner;

public class MonthSeason {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month;
		String result = "";
		System.out.print("월을 입력하세요 ==> ");
		month = sc.nextInt();
		
		if (month>2 ) {
			result = "봄";
		} else if (month > 5) {
			result = "여름";
			
		} else if (month > 8) {
			result = "가을";
			
		} else if(month > 11 || month >= 1) {
			
			result = "겨울";
		} else if(month > 12 || month < 1) {
			System.out.println("해당 월은 없습니다.");
		}
		
		System.out.println(month + "월은 "+result+"입니다.");
		
		
	}

}
