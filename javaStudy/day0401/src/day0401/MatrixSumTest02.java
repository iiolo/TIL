package day0401;

public class MatrixSumTest02 {

	public static void main(String[] args) {
		int [][]a = new int [5][5];
		int n = 1;										//n:0,1
		for (int i = 0; i < a.length - 1; i++) { // 줄 수를 위한 반복문 i,0
			for (int j = 0; j < a.length - 1; j++) {// 칸 수를 위한 반복문 j,0
				// a배열의 i줄(가로)의 j번째(세로)
				a[i][j] = n++;
				a[i][4] += a[i][j]; // 마지막 열에는 각 행의 합 누
				a[4][j] += a[i][j]; // 마지막 행에는 각 열의 합 누적
				a[4][4] += a[i][j]; // 맨마지막 행,열은 모든 요소의 합 누적
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
