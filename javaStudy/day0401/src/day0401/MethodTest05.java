package day0401;

public class MethodTest05 {
	
	public static int max(int a, int b) {	//메소드의 정의 : 메소드 이름 옆에 return 값의 자료형 작성
		int r;
		if (a>b) {
			r=a;
		} else {
			r=b;
		}
		return r;
	}
	public static void main(String[] args) {
		int result = max(3,4);
		System.out.println(result);
		System.out.println(max(40, 30));
		
	}

}
