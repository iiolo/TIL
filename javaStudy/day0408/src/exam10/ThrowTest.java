package exam10;

public class ThrowTest {

	public static void main(String[] args) {
		System.out.println("hello");
		
		throw new ArithmeticException(); // 강제로 예외 발생
		
		//예외 발생하여 여기까지 도달 못함
//		System.out.println("java");

	}

}
