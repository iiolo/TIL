package day0329;

public class SwapTest {

	public static void main(String[] args) {
		// 두개의 벼누의 값을 서로 맞바꾸어 봅시다.
		int a = 17;
		int b =24;
		System.out.println("a:" +a);
		System.out.println("b:" +b);
		
		int temp =a;
		a=b;
		b=temp;
		System.out.println("a:" +a);
		System.out.println("b:" +b);

	}

}
