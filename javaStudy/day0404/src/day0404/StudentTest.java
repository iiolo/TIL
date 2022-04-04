package day0404;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String []name = new String[5];
		int []kor = new int[5];
		int []eng = new int[5];
		int []math = new int[5];
		int []tot = new int[5];
		double []avg = new double[5];
		
		for (int i = 0; i < name.length; i++) {
			System.out.println((i+1)+"번째 학생의 이름을 입력하시오==> ");
			name[i] = sc.next();
			System.out.println((i+1)+"번째 학생의 국어점수을 입력하시오==> ");
			kor[i] = sc.nextInt();
			System.out.println((i+1)+"번째 학생의 영어점수을 입력하시오==> ");
			eng[i] = sc.nextInt();
			System.out.println((i+1)+"번째 학생의 수학점수을 입력하시오==> ");
			math[i] = sc.nextInt();
			tot[i] = kor[i]+eng[i]+math[i];
			avg[i] = tot[i]/3.0;
			
			
		}
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i] + "\t"+
					kor[i]+"\t"+
					eng[i]+"\t"+
					math[i]+"\t"+
					tot[i]+"\t"+
					avg[i]);
			
		}
		System.out.println("---------------------------------------");
		System.out.println("*** 성적 순으로 정렬 ***");
		for (int i = 0; i < name.length; i++) {
			for (int j = 0; j < name.length; j++) {
				if (tot[j]>tot[i]) {
					String name_temp = name[i];
					name[i] = name[j];
					
					int temp = kor[i];
					kor[i] = kor[j];
					kor[j] = temp;
					
					temp = eng[i];
					eng[i] = eng[j];
					eng[j] = temp;
					
					temp = math[i];
					math[i] = math[j];
					math[j] = temp;
					
					temp = tot[i];
					tot[i] = tot[j];
					tot[j] = temp;
					
					double temp_avg = avg[i];
					avg[i] = avg[j];
					avg[j] = temp_avg;
				} 
			}
		}

	}

}
