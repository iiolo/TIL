package exam13;

import java.util.StringTokenizer;


class IllegalArgumentException extends Exception {
	public IllegalArgumentException(String msg) {
		super(msg);
	}
}

class MyDate {
	String str;
	int year;
	int month;
	int date;
	public MyDate(String str) throws IllegalArgumentException {
		if (str == null) {
			throw new IllegalArgumentException("연도/월/일 을 입력하세요");
			
		}
		StringTokenizer st = new StringTokenizer(str, "/");
		year = Integer.parseInt(st.nextToken());
		month = Integer.parseInt(st.nextToken());
		date = Integer.parseInt(st.nextToken());
		
		
		
	}
	public String getStr() {
		return str;
	}
	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
	public int getDate() {
		return date;
	}
	
	
	
	
}
public class MyDateTest {

	public static void main(String[] args) {
		try {
//			String data = "2022/04/08";
			String data = null;// 아무것도 참조하지 않은 상태
			MyDate md = new MyDate(data);
			System.out.println("연도: "+ md.getYear());
			System.out.println("월: "+ md.getMonth());
			System.out.println("일: "+ md.getDate());
		} catch (Exception e) {
			System.out.println("예외 발생: "+e.getMessage());
		}

	}

}
