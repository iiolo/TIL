package day0331;

import java.util.Random;

public class AutoLottoSort {

	public static void main(String[] args) {
		int []data = new int[6];
		Random r = new Random();
		
		for (int i = 0; i < data.length;) {
			int n = r.nextInt(45)+1;
			
			int j;
			
			// n�� data �迭�� �̹� �ִ� �� �Ǻ��Ͽ� �ߺ��� ���� �ʵ��� ó��
			for (j = 0; j < i; j++) {
				if(n == data[j]){
					break;
				}
			}// end for j
			
			if (j == i) {
				data[i] = n;
				i++;
			}
			
			
		}// end for i
		
		
		// ����
		for (int i = 0; i < data.length; i++) {
			for (int j = i+1; j < data.length; j++) {
				if (data[j] < data[i]) {
					int temp = data[i];
					data[i]=data[j];
					data[j]=temp;
				}
			}
		}
		
		
		// ���
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]+ " ");
		}
		

	}

}
