package day0331;


import java.util.Random;


public class LottoTestAuto {

	public static void main(String[] args) {
		int []data = new int[6];
		
		// 1~ 45 ������ �ƹ� ���ڸ� ������ �� ==> ����
		Random r = new Random();
		
		for (int i = 0; i < data.length; i++) {
			data[i] = r.nextInt(45)+1;
			System.out.print(data[i] + " ");
		}

	}

}
