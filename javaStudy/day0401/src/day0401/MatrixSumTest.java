package day0401;

public class MatrixSumTest {

	public static void main(String[] args) {
		int [][]a = new int [4][5];
		int n = 1;										//n:0,1
		for (int i = 0; i < 4; i++) { // �� ���� ���� �ݺ��� i,0
			for (int j = 0; j < 4; j++) {// ĭ ���� ���� �ݺ��� j,0
				// a�迭�� i��(����)�� j��°(����)
				a[i][j] = n++;
				a[i][4] += a[i][j]; // a[i][4] + a[i][j]
				
			}
			
		}
		
		// ����ϱ�
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
