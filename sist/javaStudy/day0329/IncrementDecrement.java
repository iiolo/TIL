package day0329;

public class IncrementDecrement {

	public static void main(String[] args) {
//		int a = 5;
//		int b = 5;
//		a++; // a=a+1
//		b--; // b = b-1
//		
//		System.out.println(a);
//		System.out.println(b);
		
//		// 증감 연산자 위치
//		int a =5;
//		int b =5;
//		++a;//a = a+1
//		--a;//b =b-1
//		System.out.println(a);
//		System.out.println(a);
		
		// 증감연산자와 다른 연산자가 같이 쓰일 경우
		int a = 5;
		int b = 5;
		
		// 증감 연산자와 대입연산자가 함께 쓰이는 경우
		int i = a++; // 증감연산자가 변수 명 뒤에 있을 경우 대입 연산자 먼저 처리하고 증감연산자 처리 
		int j = ++b; // 증감연산자가 변수 명 앞에 있을 경우 증감연산자 먼저 처리하고 대입 연산자 처리 
		
		System.out.println("a : "+a); //6
		System.out.println("b : "+b); //6
		System.out.println("i : "+i); //5
		System.out.println("j : "+j); //6
	}

}
