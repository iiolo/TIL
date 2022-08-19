import java.util.Scanner;
class NameAndAge02 {
	public static void main(String []args){
		String name;
		int age;
		Scanner sc = new Scanner(System.in);
     		System.out.println("이름은 무엇입니까? : ");
		name = sc.next();
		System.out.println("나이는 몇 살 입니까? : ");
		age = sc.nextInt();
		System.out.println("당신의 이름은 " + name+"이고 나이는 " +age+"살입니다.");
	}

}