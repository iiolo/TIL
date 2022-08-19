package exam01;

import java.util.Scanner;

public class JoinTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id, pwd, email;
		
		
		
		while (true) {
			System.out.print("���̵� �Է��ϼ���: ");
			id = sc.next();
			
			if (id.length() >= 6 && 
					(id.charAt(0)>='A'&&id.charAt(0)<='Z'||
					id.charAt(0)>='a' && id.charAt(0)<='z')) {
				break;
			}
			System.out.println("���̵�� 6���� �̻��̰� ù ���ڴ� �������� �Է��ϼ���");
		}
		
		
		do {
			System.out.print("��ȣ�� �Է��ϼ���: ");
			pwd = sc.next();
			
			String data = "!@#$%^&*(),./-+";
			boolean isFlag = false;
			
			
			// Ư�����ڸ� �����ϰ� �ִ� �� 
			for (int i = 0; i < pwd.length(); i++) {
				char p = pwd.charAt(i);
				for (int j = 0; j < data.length(); j++) {
					char d = data.charAt(j);
					
					// pwd ���ڿ� �� Ư�� ���ڿ� �����س��� data�� ���� ���ڰ� ������ Ư������ ������ ��Ÿ���� isFlag�� true ���� �� Ż�� 
					if (p == d) {
						isFlag = true;
						break;
					}					
				}
				// Ư�����ڸ� ����(true)�ϰ� ������ Ż��
				if(isFlag == true) {
					break;
				}
				
			}
			
			// Ư������ ���� && ��ȣ 8���� �̻�
			if (isFlag == true & pwd.length() >= 8) {
				break;
			}
			System.out.println("��ȣ�� 8���� �̻��̰� Ư�����ڸ� �����ؾ� �մϴ�.");
			System.out.println("������ Ư������: !@#$%^&*(),./-+");
		} while (true);
		
		
		
		do {
			System.out.print("�̸����� �Է��ϼ���: ");
			email = sc.next();
			
			int idx = email.indexOf("@");
			String []data = {".com", "co.kr"};
			
			boolean flag = false;
			for (String end : data) {
				if (email.endsWith(end)) {
					flag = true;
					break;
				}
			}
			if (idx >= 2 && flag == true) {
				break;
			}
			System.out.println("�ùٸ� �̸��� ������ �ƴմϴ�.");
			
			
		} while (true);
		
		
	
		System.out.println("-----------------------------");
		System.out.println("���������� ������ �����ϴ�.");
//		System.out.println("���̵�: "+id);
//		System.out.println("��ȣ: "+pwd);
//		System.out.println("���̵�: "+email);
		System.out.println("-----------------------------");
	}

}