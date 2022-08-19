package day0401;

import java.util.Scanner;

public class MethodTest10_Array {
	
	public static boolean printSame(int []a, int []b) {	//메소드의 정의 : 메소드 이름 옆에 return 값의 자료형 작성
		boolean flag = true;
		
		if (a.length != b.length) {
			return false;
		} 
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				flag = false;
				break;
			}
		}
		
		return flag;
	}
	public static void main(String[] args) {
		int data1[]= {1,2,3,4,5};
		int data2[]= {1,2,3,4,5};
		if (printSame(data1, data2)) {
			System.out.println("두 배열이 같아요!");
		} else {
			System.out.println("두 배열이 달라요!");
		}
		
		
	}

}
