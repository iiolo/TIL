package exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;



public class DeleteMember {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id;
		System.out.print("삭제할 회원의 아이디를 입력==>");
		id = sc.next();
		
		String sql ="delete member where id='"+id+"'";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = 
			DriverManager.getConnection("jdbc:oracle:thin:@192.168.35.217:1521:XE", 
					"c##sist", "sist");
			Statement stmt = conn.createStatement();
			int re = stmt.executeUpdate(sql);
			if(re == 1) {
				System.out.println(id+"회원의 정보를 삭제하였습니다.");
			}else {
				System.out.println("회원삭제에 실패하였습니다.");
			}
			
			stmt.close();
			conn.close();
			
		}catch (Exception e) {
			
		}
	}
}











