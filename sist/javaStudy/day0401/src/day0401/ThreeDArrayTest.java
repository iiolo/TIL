package day0401;

public class ThreeDArrayTest {
	public static void main(String[] args) {
		int [][][]a = new int[2][3][5];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for (int k = 0; k < a[i][j].length; k++) {
					a[i][j][k] = i;
				}
			}
		}
		
		// Ãâ·Â
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for (int k = 0; k < a[i][j].length; k++) {
					System.out.print(a[i][j][k] + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}

	}
}
