package day0401;

import java.util.Scanner;

public class MethodTest07 {
	
	public static String getScoreName(String []name, int []score) {	//메소드의 정의 : 메소드 이름 옆에 return 값의 자료형 작성
		String max_name ="";
		int max = score[0];
		int idx = 0;
		for (int i = 1; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i];
				idx = i;
			}
		}
		max_name = name[idx];
		return max_name;
	
	}
	public static void main(String[] args) {
		String []name = {"유관순", "이순신", "홍길동", "김유신", "강감찬"};
		int []score = {60, 70, 80, 100, 50};
		System.out.println("가장 높은 점수의 학생 이름은 : "+getScoreName(name, score));
		
		
		
	}

}
