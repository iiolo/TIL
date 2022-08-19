package day0331;

import java.util.Iterator;
import java.util.Scanner;

public class AvgTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int student[] = new int[5];
		for (int i = 0; i < student.length; i++) {
			System.out.print((i+1)+"번째 학생의 점수를 입력 ==> ");
			student[i] = sc.nextInt();
			
		
		}
		
		System.out.println();
		int total = 0;
		System.out.println("*** 성적 처리 결과 ***");
		for (int i = 0; i < student.length; i++) {
			System.out.println((i+1)+"번째 학생의 점수: "+student[i]);
			total += student[i];
		}
		
		double avg = (double)total/student.length;
		System.out.println("총점: "+total);
		System.out.println("평균: "+avg);

	}

}
