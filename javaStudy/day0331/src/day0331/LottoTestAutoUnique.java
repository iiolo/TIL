package day0331;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class LottoTestAutoUnique {

	public static void main(String[] args) {
		int []data = new int[6];
		
		// 1~ 45 사이의 아무 숫자를 만들어야 됨 ==> 난수
		Random r = new Random();
		
		
		for (int i = 0; i < data.length;) {
			int n = r.nextInt(45)+1;
			
			int j;
			
			// n이 data 배열에 이미 있는 지 판별하여 중복이 되지 않도록 처리
			for (j = 0; j < i; j++) {
				if(n == data[j]){
					break;
				}
			}
			
			if (j == i) {
				data[i] = n;
				i++;
			}
			
			
		}
		
		
		
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}

	}

}
