package day0401;

public class MatrixSumTest02 {

	public static void main(String[] args) {
		int [][]a = new int [5][5];
		int n = 1;										//n:0,1
		for (int i = 0; i < a.length - 1; i++) { // �� ���� ���� �ݺ��� i,0
			for (int j = 0; j < a.length - 1; j++) {// ĭ ���� ���� �ݺ��� j,0
				// a�迭�� i��(����)�� j��°(����)
				a[i][j] = n++;
				a[i][4] += a[i][j]; // ������ ������ �� ���� �� ��
				a[4][j] += a[i][j]; // ������ �࿡�� �� ���� �� ����
				a[4][4] += a[i][j]; // �Ǹ����� ��,���� ��� ����� �� ����
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
