import java.util.Scanner;
class NameAndAge02 {
	public static void main(String []args){
		String name;
		int age;
		Scanner sc = new Scanner(System.in);
     		System.out.println("�̸��� �����Դϱ�? : ");
		name = sc.next();
		System.out.println("���̴� �� �� �Դϱ�? : ");
		age = sc.nextInt();
		System.out.println("����� �̸��� " + name+"�̰� ���̴� " +age+"���Դϴ�.");
	}

}