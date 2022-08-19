//Exam01.plusOne(age); 코딩결과값은 29로 나오는데 맞나요?


package exam04;
class Exam01{	
	//정수형 변수 하나를 매개변수로 전달받아 1증가 시키는 메소드를 정의
	public static void plusOne(int n) {
		n = n + 1;
		System.out.println(n);
		System.out.println("메소드 안에서 값을 변경하였습니다.");
		System.out.println();
	}
}

public class CallByValueTest {
	public static void main(String[] args) {
		int age;
		age = 28;
		Exam01.plusOne(age);
		System.out.println("나이:"+age);
		System.out.println("그러나 메소드 호출하는 쪽에서는 변경된 내용이 적용되지 않아요!");
	}
}
