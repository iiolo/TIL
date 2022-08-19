package day0330;

import java.util.Iterator;
import java.util.Scanner;

public class StringEqualsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String data;
		System.out.print("문자열을 입력하세요 ==> ");
		data = sc.next();
		
		if (data.equals("hello")) {
			System.out.println("맞아요");
		} else {
			System.out.println("틀려요");
		}
	}

}
