package exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ListMember {
	public static void main(String[] args) {		

		//실행하고자 하는 데이터베이스 명령어를 변수에 저장한다.
		String sql = "select * from member";		
		try {
			
			//jdbc드라이버를 메모리로 로그한다.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//DB서버에 연결합니다.
			Connection conn = 
			DriverManager.getConnection("jdbc:oracle:thin:@192.168.35.217:1521:XE", 
					"c##sist", "sist");
			
			//데이터베이스 명령을 실행하기 위한 객체를 생성합니다.
			Statement stmt = conn.createStatement();
			
			// 데이터베이스 명령어를 실행합니다.
			// executeUpdate	==> 데이터베이스에 변동이 명령을 실행할 때 사용.
			// executeQuery		==> 데이터베이스의 자료를 조회할 때 사용.
			ResultSet rs  = stmt.executeQuery(sql);
			
			//검색한 결과에 자료가 있는 만큼 반복 실행합니다.	
			//rs.next()는 다음레코드를 커서를 옮겨주고  true반환합니다.
			//더이상 옮겨질 레코드가 없으면 false를 반환합니다.
			while(rs.next()) {
				
				//현재커서가 가리키고 있는 곳에 값을 갖고 오기
				//rs.getXXX(인덱스)
				//컬럼의 인덱스는 1부터 시작합니다.
				//XXX에는 문자열이는 String 정수이면 Int
				String id = rs.getString(1);
				String name = rs.getString(2);
				int age = rs.getInt(3);
				
				System.out.println(id + ","+  name + "," + age);
				
			}
			
			System.out.println("모두 출력하였습니다.");
			System.out.println("---------------------------------------------");
			
			// 사용했던 자원을 닫아 줍니다.
			// 가장 나중에 만들었던 자원부터 닫아 줍니다.
			rs.close();
			stmt.close();
			conn.close();
			
		}catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
	}
}		












