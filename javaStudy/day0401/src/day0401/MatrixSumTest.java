package day0401;

public class MatrixSumTest {

	public static void main(String[] args) {
		int [][]a = new int [4][5];
		int n = 1;										//n:0,1
		for (int i = 0; i < 4; i++) { // 줄 수를 위한 반복문 i,0
			for (int j = 0; j < 4; j++) {// 칸 수를 위한 반복문 j,0
				// a배열의 i줄(가로)의 j번째(세로)
				a[i][j] = n++;
				a[i][4] += a[i][j]; // a[i][4] + a[i][j]
				
			}
			
		}
		
		// 출력하기
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
