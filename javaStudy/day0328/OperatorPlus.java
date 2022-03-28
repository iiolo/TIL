import java.util.Scanner;
class OperatorPlus {
	public static void main(String []args){
		int a;
		int b;
		int add;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		add = a + b;
		System.out.println("결과는 " +add + " 입니다.");
	}
}