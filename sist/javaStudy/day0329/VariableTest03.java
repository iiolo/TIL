package day0329;

public class VariableTest03 {

	public static void main(String[] args) {
		String korea;
		korea = "hello";
		System.out.println(korea);//변수(문자열 변수)
		System.out.println("korea");//상수(문자열 상수)
		
		System.out.println(100);// 상수(정수형 상수)
		System.out.println("100");// 상수(문자열 상수)
		
		System.out.println(100+200);// 숫자끼리 오면 더하기 연산 수행
		System.out.println("100"+"200");// 문자열끼리 오면 연결해줌
		System.out.println("100"+200);// 앞에가 문자열일 경우 연결

	}

}
