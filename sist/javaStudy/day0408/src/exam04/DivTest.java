package exam04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivTest {

	public static void main(String[] args) {
		int a,b,div;
		
		try {
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
			div = a/b;
			System.out.println("나누기 결과: "+div);
		} catch (ArithmeticException e) {//어떤 종류의 에러인지
			System.out.println("0으로는 나눌 수 없습니다.");
		} catch (InputMismatchException e) {
			System.out.println("숫자 형식에 맞지 않습니다.");
		} catch(NumberFormatException e) {
			System.out.println("숫자 형식에 맞지 않습니다.");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("나누기할 두 수를 전달해 주세요.");
		}
	}

}
