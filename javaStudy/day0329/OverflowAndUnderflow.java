package day0329;

public class OverflowAndUnderflow {

	public static void main(String[] args) {
		//overflow
		byte a = 127;
		a = (byte)(a+1); 
		System.out.println(a);
		
		//underflow
		byte b = -128;
		b = (byte)(b-1); 
		System.out.println(b);
		

	}

}
