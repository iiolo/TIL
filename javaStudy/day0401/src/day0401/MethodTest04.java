package day0401;

public class MethodTest04 {
	
	public static void max(int a, int b) {	//메소드의 정의
		int r;
		if (a>b) {
			r=a;
		} else {
			r=b;
		}
		System.out.println("큰 수는 "+r+"입니다.");
		System.out.println("------------------------------");
		return;
	}
	public static void main(String[] args) {
		max(7,5);
		max(2,3);
		
	}

}
