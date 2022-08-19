package exam02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class InsertScore {

	public static void main(String[] args) {
		String name;
		int no,ko,en,math;
		Scanner sc = new Scanner(System.in);

		System.out.print("새로 등록할 학생의 번호를 입력하세요==> ");
		no = sc.nextInt();

		System.out.print("새로 등록할 학생의 이름을 입력하세요==> ");
		name = sc.next();

		System.out.print("새로 등록할 학생의 국어 점수를 입력하세요==> ");
		ko = sc.nextInt();
		
		System.out.print("새로 등록할 학생의 영어 점수를 입력하세요==> ");
		en = sc.nextInt();
		
		System.out.print("새로 등록할 학생의 수학 점수를 입력하세요==> ");
		math = sc.nextInt();

		// 입력받은 아이디,이름,나이를 갖고 데이터베이스 명령어 생성
		String sql = "insert into student values('" + no + "','" + name + "',' " + ko+ "',' " + en+ "', " + math + ")";

		try {

			// 1. jdbc 드라이버를 메모리로 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. db서버에 연결
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.35.217:1521", "c##sist", "sist");

			// 3. 데이터베이스 명령을 실행하기 위한 객체를 생성
			Statement stmt = conn.createStatement();

			// 4. 데이터베이스 명령을 실행
			stmt.executeUpdate(sql);

			// 5. 사용이 끝난 자원을 닫기
			stmt.close();
			conn.close();

			System.out.println("학생의 정보를 등록하였습니다.");

		} catch (Exception e) {
			System.out.println("예외발생:" + e.getMessage());
		}


	}

}
