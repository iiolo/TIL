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
			throw new IllegalArgumentException("����/��/�� �� �Է��ϼ���");
			
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
			String data = null;// �ƹ��͵� �������� ���� ����
			MyDate md = new MyDate(data);
			System.out.println("����: "+ md.getYear());
			System.out.println("��: "+ md.getMonth());
			System.out.println("��: "+ md.getDate());
		} catch (Exception e) {
			System.out.println("���� �߻�: "+e.getMessage());
		}

	}

}
