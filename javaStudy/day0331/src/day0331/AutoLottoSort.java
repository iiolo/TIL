package day0331;

import java.util.Random;

public class AutoLottoSort {

	public static void main(String[] args) {
		int []data = new int[6];
		Random r = new Random();
		
		for (int i = 0; i < data.length;) {
			int n = r.nextInt(45)+1;
			
			int j;
			
			// n이 data 배열에 이미 있는 지 판별하여 중복이 되지 않도록 처리
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
		
		
		// 정렬
		for (int i = 0; i < data.length; i++) {
			for (int j = i+1; j < data.length; j++) {
				if (data[j] < data[i]) {
					int temp = data[i];
					data[i]=data[j];
					data[j]=temp;
				}
			}
		}
		
		
		// 출력
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]+ " ");
		}
		

	}

}
