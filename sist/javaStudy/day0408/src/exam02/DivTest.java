package exam02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivTest {

	public static void main(String[] args) {
		int a,b,div;
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 수를 입력하세요: ");
		a = sc.nextInt();
		System.out.print("두 번째 수를 입력하세요: ");
		b = sc.nextInt();
		div = a/b;
		System.out.println("나누기 결과: "+div);
		
	}

}
