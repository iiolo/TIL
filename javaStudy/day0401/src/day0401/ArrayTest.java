package day0401;

public class ArrayTest {

	public static void main(String[] args) {
		int a[][] = new int [3][];
		a[0]=new int [2];
		a[1]=new int [5];
		a[2]=new int [3];
		
		int n =1;
		// �� �迭�� ��ҿ� 1���� 1�� ������ �� ����
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = n++;
			}
		}
		
		// ��� �迭 ��� ���
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
