package exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class InsertMember {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id, name;
		int age;
		
		System.out.print("등록할 회원의 아이디를 입력==>");
		id = sc.next();
		System.out.print("등록할 회원의 이름을 입력==>");
		name = sc.next();		
		System.out.print("등록할 회원의 나이를 입력==>");
		age = sc.nextInt();
		
		String sql = "insert into member values('"+id+"', '"+name+"', "+age+")";		
		try {
			//jdbc드라이버를 메모리로 로드한다.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//DB 서버에 연결한다.
			Connection conn = 
			DriverManager.getConnection("jdbc:oracle:thin:@211.238.142.98:1521:XE", 
					"c##sist", "sist");
			
			//데이터베이스 명령을 실행하기 위한 객체를 생성
			Statement stmt = conn.createStatement();
			
			// 데이터베이스 명령어를 실행합니다.
			// executeUpdate  ==> 데이터베이스에 변동이 있는 명령을 실행할 때에 사용
			// executeQuery   ==> 데이터베이스의 내용을 조회하는 명령을 실행할 때에 사용
			int re = stmt.executeUpdate(sql);
			//성공적으로 명령을 실행한 레코드의 수를 반환
			
			if(re == 1) {
				System.out.println("회원의 정보를 추가하였습니다.");
			}else {
				System.out.println("회원정보 추가에 실패하였습니다.");
			}
			
			//사용했던 자원을 닫아 줍니다.
			stmt.close();
			conn.close();
			
		}catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
		
	}
}
