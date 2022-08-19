package exam02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


public class ListMember {
	public static void main(String[] args) {
		String sql = "select * from member";
		try {

			// 1. jdbc 드라이버를 메모리로 로드한다.
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. db서버에 연결한다.
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.35.217:1521", "c##sist", "sist");

			// 3. 데이터베이스 명령을 실행하기 위한 객체를 생성합니다.
			Statement stmt = conn.createStatement();

			// 4. 데이터베이스 명령을 실행한다.
			// executeUpdate : 데이터베이스에 변경이 있는 명령을 실행할 때 사용
			// executeQuery : 데이터베이스로부터 읽어오는 명령을 실행할 때 사용
			ResultSet rs = stmt.executeQuery(sql); // 읽어온 결과를 ResultSet 객체에 담는다
			
			// 5. 읽어온 데이터만큼 반복 실행
			while (rs.next()) { // 데이터가 있는 만큼 반복 실행
				String id = rs.getString(1); // 커져가 바라보고 있는 1번째 
				String name = rs.getString(2); // 커져가 바라보고 있는 2번째 
				int age = rs.getInt(3); // 커져가 바라보고 있는 3번째
				
				System.out.println("아이디: "+id);
				System.out.println("이름: "+name);
				System.out.println("나이: "+age);
				System.out.println("-------------------------");
				
				
			}
			
			// 6. 사용이 끝난 자원을 닫아 줍니다.
			stmt.close();
			conn.close();

			System.out.println("회원의 정보를 출력하였습니다.");

		} catch (Exception e) {
			System.out.println("예외발생:" + e.getMessage());
		}

	}
}
