package day0401;

import java.util.Random;

public class Practice0401 {

	public static void main(String[] args) {
		
		//130-14
		int [][]a = {{1,2,3},{1,2},{1},{1,2,3}};								
		// ����ϱ�
		for (int i = 0; i < a.length; i++) { // �� ��
			for (int j = 0; j < a[i].length; j++) {//ĭ��
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		//131-15
		Random r = new Random();
		
		int b[][] = new int [3][5];
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				b[r.nextInt(3)][r.nextInt(5)] = 1;
				
			}
		}
		
		for (int i = 0; i < b.length; i++) { // �� ��
			for (int j = 0; j < b[i].length; j++) {//ĭ��
				System.out.print(b[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
