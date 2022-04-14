package day0330;

public class EvenTest {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print(i+ " ");
			}
		}
		
		System.out.println();
		for (int j = 2; j <= 100; j = j+2) {
			System.out.print(j+ " ");
		}
		
	}

}
