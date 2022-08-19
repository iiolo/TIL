package day0330;

public class DigitToKor_Switch02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2;
		switch (n) {
		case 0:
			System.out.println("영");
		case 1:
			System.out.println("일");
		case 2:
			System.out.println("이"); break;
		case 3:
			System.out.println("삼");
		case 4:
			System.out.println("사");
		case 5:
			System.out.println("오");
		case 6:
			System.out.println("육"); break;
		case 7:
			System.out.println("칠");
		case 8:
			System.out.println("팔");
		case 9:
			System.out.println("구");break;
		default:
			System.out.println("입력범위를 넘었습니다.");
		}
		
		System.out.println("작업 종료");
	}
	
}
