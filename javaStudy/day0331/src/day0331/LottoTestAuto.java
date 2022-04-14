package day0331;


import java.util.Random;


public class LottoTestAuto {

	public static void main(String[] args) {
		int []data = new int[6];
		
		// 1~ 45 사이의 아무 숫자를 만들어야 됨 ==> 난수
		Random r = new Random();
		
		for (int i = 0; i < data.length; i++) {
			data[i] = r.nextInt(45)+1;
			System.out.print(data[i] + " ");
		}

	}

}
