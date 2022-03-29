package day0329;

public class BitOperator {

	public static void main(String[] args) {
		int a = 10;// 00001010
		int b = 5; // 00000101
		int i = a&b;//00000000
		int j =a|b;// 00001111 => 2^3 + 2^2 + 2^1 +2^0 = 15
		int k = a^b;//00001111 => 2^3 + 2^2 + 2^1 +2^0 = 15
		
		System.out.println("i: "+i);
		System.out.println("j: "+j);
		System.out.println("k: "+k);

	}

}
