package exam01;

import java.util.Scanner;

public class JoinTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id, pwd, email;
		
		
		
		while (true) {
			System.out.print("아이디를 입력하세요: ");
			id = sc.next();
			
			if (id.length() >= 6 && 
					(id.charAt(0)>='A'&&id.charAt(0)<='Z'||
					id.charAt(0)>='a' && id.charAt(0)<='z')) {
				break;
			}
			System.out.println("아이디는 6글자 이상이고 첫 글자는 영문으로 입력하세요");
		}
		
		
		do {
			System.out.print("암호를 입력하세요: ");
			pwd = sc.next();
			
			String data = "!@#$%^&*(),./-+";
			boolean isFlag = false;
			
			
			// 특수문자를 포함하고 있는 가 
			for (int i = 0; i < pwd.length(); i++) {
				char p = pwd.charAt(i);
				for (int j = 0; j < data.length(); j++) {
					char d = data.charAt(j);
					
					// pwd 문자열 중 특수 문자열 저장해놓은 data과 같은 인자가 있으면 특수문자 포함을 나타내는 isFlag에 true 저장 및 탈출 
					if (p == d) {
						isFlag = true;
						break;
					}					
				}
				// 특수문자를 포함(true)하고 있으면 탈출
				if(isFlag == true) {
					break;
				}
				
			}
			
			// 특수문자 포함 && 암호 8글자 이상
			if (isFlag == true & pwd.length() >= 8) {
				break;
			}
			System.out.println("암호는 8글자 이상이고 특수문자를 포함해야 합니다.");
			System.out.println("가능한 특수문자: !@#$%^&*(),./-+");
		} while (true);
		
		
		
		do {
			System.out.print("이메일을 입력하세요: ");
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
			System.out.println("올바른 이메일 형식이 아닙니다.");
			
			
		} while (true);
		
		
	
		System.out.println("-----------------------------");
		System.out.println("가입정보는 다음과 같습니다.");
//		System.out.println("아이디: "+id);
//		System.out.println("암호: "+pwd);
//		System.out.println("아이디: "+email);
		System.out.println("-----------------------------");
	}

}
