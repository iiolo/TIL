package day0401;

import java.util.Scanner;

public class MethodTest09_Array {
	
	public static double printAvg(double []a) {	//�޼ҵ��� ���� : �޼ҵ� �̸� ���� return ���� �ڷ��� �ۼ�
		double sum =0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum/a.length;
	}
	public static void main(String[] args) {
		double []data = {2.5, 6.7,3.2};
		System.out.println("�迭�� ����� : "+printAvg(data));
		
		
	}

}
