package day0401;

import java.util.Scanner;

public class MethodTest07 {
	
	public static String getScoreName(String []name, int []score) {	//�޼ҵ��� ���� : �޼ҵ� �̸� ���� return ���� �ڷ��� �ۼ�
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
		String []name = {"������", "�̼���", "ȫ�浿", "������", "������"};
		int []score = {60, 70, 80, 100, 50};
		System.out.println("���� ���� ������ �л� �̸��� : "+getScoreName(name, score));
		
		
		
	}

}
