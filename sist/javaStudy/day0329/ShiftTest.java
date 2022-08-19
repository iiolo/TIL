package day0329;

public class ShiftTest {
	public static void main(String[] args) {
		int i =8;//		 00001000
		int a = i << 1;//00010000 = 2^4 = 16
		int b = i >> 1;//00000100 = 2^2 = 4
		System.out.println("a: "+a); 
		System.out.println("b: "+b);
	}

}
