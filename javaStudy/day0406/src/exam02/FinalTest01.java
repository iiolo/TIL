package exam02;

class Person{
	String name = "홍길동";
	int age = 20;
	final static String ADDR = "서울시 마포구 서교동";
	//final은 어차피 못바꾸는 것이라서
	//객체마다 따로 메모리를 잡을 필요가 없어요
	//그래서 final 이면 static으로 만들어서 
	//모든 객체가 같이 사용합니다.
}

public class FinalTest01 {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.age = 21;
		p2.age = 31;
		
//		p1.ADDR = "제주도 서귀포시";
//		p2.ADDR = "경기도 파주시";
		//addr를 상수이기 때문에 접근하여 값을 변경시킬 수 없어요!
		
	}
}