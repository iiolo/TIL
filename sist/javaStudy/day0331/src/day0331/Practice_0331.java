package day0331;

import java.util.Arrays;
import java.util.Scanner;

public class Practice_0331 {

	public static void main(String[] args) {
		
		// 129-1
		double []data = { 1.0, 2.0, 3.0, 4.0 };
		double sum=0;
		
		for (int i = 0; i < data.length; i++) {
			sum += data[i];
			
		}
		
		double max = data[0];
		
		for (int i = 1; i < data.length; i++) {
			if (max<data[i]) {
				max =data[i];
			}
		}
		 
		System.out.println(Arrays.toString(data));
		System.out.println("���� "+sum);
		System.out.println("�ִ� ���� "+max);
		
		System.out.println("---------------------------------");
		
		// 130-11
		String []hello = {"Hello", "Java","World"};
		for (int i = 0; i < hello.length; i++) {
			System.out.println(hello[i]);
		}
		System.out.println("---------------------------------");
		
		Scanner sc = new Scanner(System.in);
		
		int capacity=5;
		int []test = new int[capacity];
		int sum1 = 0;
		double avg=0;

		
		for (int i = 0; i < test.length; i++) {
			capacity++;
			System.out.print("������ �Է��ϼ���: ");
			test[i] = sc.nextInt();
			if (test[i] == -1) {
				break;
			}
			
			sum1 += test[i];
			avg = (double)sum / test.length;
			
		}
		System.out.println("�հ�: "+sum1);
		System.out.println("���: "+avg);
		
	}

}
