package day0401;

import java.util.Scanner;

public class MethodTest08_Array {
	
	public static void printMax(int []a) {	//�޼ҵ��� ���� : �޼ҵ� �̸� ���� return ���� �ڷ��� �ۼ�
		int max=a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("�迭 �߿� ���� ū ���� : "+max);
	}
	public static void main(String[] args) {
		int []data = {9,2,7,50,6};
		printMax(data);
		
		
	}

}
