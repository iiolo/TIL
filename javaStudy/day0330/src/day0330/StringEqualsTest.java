package day0330;

import java.util.Iterator;
import java.util.Scanner;

public class StringEqualsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String data;
		System.out.print("���ڿ��� �Է��ϼ��� ==> ");
		data = sc.next();
		
		if (data.equals("hello")) {
			System.out.println("�¾ƿ�");
		} else {
			System.out.println("Ʋ����");
		}
	}

}
