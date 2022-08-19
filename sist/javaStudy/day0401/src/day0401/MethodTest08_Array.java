package day0401;

import java.util.Scanner;

public class MethodTest08_Array {
	
	public static void printMax(int []a) {	//메소드의 정의 : 메소드 이름 옆에 return 값의 자료형 작성
		int max=a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("배열 중에 가장 큰 수는 : "+max);
	}
	public static void main(String[] args) {
		int []data = {9,2,7,50,6};
		printMax(data);
		
		
	}

}
