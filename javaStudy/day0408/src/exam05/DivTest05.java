package exam05;

import java.util.Scanner;

public class DivTest05 {

	public static void main(String[] args) {
		int a,b,div;
		
		try {
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
			div = a/b;
			System.out.println("나누기 결과: "+div);
		} 
		catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}catch (Exception e) {
			System.out.println("니누기할 두 개의 정수를 전달 해 주세요"); // 0으로 나눴을 때 나오는 예외 제외하고 나머지 모두 이명령어로 처리
		} 
	}

}
