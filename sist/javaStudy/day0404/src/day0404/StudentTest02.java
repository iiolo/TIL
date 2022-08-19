package day0404;

import java.util.Scanner;

public class StudentTest02 {

	public static void main(String[] args) {
		Student[] data = new Student[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < data.length; i++) {
			data[i] = new Student(); // name,kor,eng,math,tot,avg
			System.out.println((i + 1) + "번째 학생의 이름을 입력하시오==>");
			data[i].name = sc.next();
			System.out.println((i + 1) + "번째 학생의 국어점수을 입력하시오==>");
			data[i].kor = sc.nextInt();
			System.out.println((i + 1) + "번째 학생의 영어점수을 입력하시오==>");
			data[i].eng = sc.nextInt();
			System.out.println((i + 1) + "번째 학생의 수학점수을 입력하시오==>");
			data[i].math = sc.nextInt();

			data[i].tot = data[i].kor + data[i].eng + data[i].math;
			data[i].avg = data[i].tot / 3.0;
		}
		System.out.println("---------------------------------------");
		System.out.println("*** 성적 순으로 정렬 ***");
		
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length; j++) {
				if (data[j].tot > data[i].tot) {
					Student temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");

		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i].name + "\t" + data[i].kor + "\t" + data[i].eng + "\t" + data[i].math + "\t"
					+ data[i].tot + "\t" + data[i].avg);

		}

		

	}

}
