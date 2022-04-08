package exam03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivTest {

	public static void main(String[] args) {
		int a,b,div;
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("첫 번째 수를 입력하세요: ");
			a = sc.nextInt();
			System.out.print("두 번째 수를 입력하세요: ");
			b = sc.nextInt();
			div = a/b;
			System.out.println("나누기 결과: "+div);
		} catch (ArithmeticException e) {//어떤 종류의 에러인지
			System.out.println("0으로는 나눌 수 없습니다.");
		} catch (InputMismatchException e) {
			System.out.println("숫자 형식에 맞지 않습니다.");
		}
	}

}
