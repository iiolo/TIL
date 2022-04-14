package day0401;

public class MethodTest02 {
	
	public static void sayHello(String name, int n) {	//메소드의 정의
		for (int i = 1; i <= n; i++) {
			System.out.println(name+"야(아) 안녕");
		}
		return;
	}
	public static void main(String[] args) {
		sayHello("민지",10);					// 메소드의 호출

		int year = 2022;
		System.out.println("올해는 "+year+"연도 입니다.");
		sayHello("주희",5);
	
		String title = "쌍용교육센터";
		System.out.println(title+"에서 훈련 받고 있어요!");
		sayHello("다정", 2);
		
	}

}
