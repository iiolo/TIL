package exam07;


public class DivTest07 {
	public static void calcDiv(int a, int b) {
		try {
			int div = a / b;
			System.out.println("나누기 결과: "+div);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수는 없어요");
		}
		
	}
	public static void main(String[] args) {
		calcDiv(9,0);
		
	}

}
