package day0330;

public class SwitchTest02 {

	public static void main(String[] args) {
		int n = 2;
		
		switch(n+1) {
			case 1: 
				System.out.println("일");
				break;
			case 2: 
				System.out.println("이");
				break;
			case 3: 
				System.out.println("삼");
				break;
			case 4: 
				System.out.println("사");
				break;
			case 5: 
				System.out.println("오");
				break;
			case 6: 
				System.out.println("육");
				break;
			default :
				System.out.println("1에서 5의 값이 아닙니다");
				break;
		}

	}

}
