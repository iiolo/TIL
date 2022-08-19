package day0330;

public class DigitToKor_Switch03 {

	public static void main(String[] args) {
		int n = 3;
		switch (n) {
		case 0:
		case 1:
		case 2: System.out.println("이"); break;
		case 3:
		case 4:
		case 5:
		case 6:System.out.println("육"); break;
		case 7:
		case 8:
		case 9:System.out.println("구"); break;
		default: System.out.println("입력 범위를 넘었습니다.");
		}
		
		System.out.println("작업종료");

	}

}
