package exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;



public class DeleteMember {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id;
		System.out.print("������ ȸ���� ���̵� �Է�==>");
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
				System.out.println(id+"ȸ���� ������ �����Ͽ����ϴ�.");
			}else {
				System.out.println("ȸ�������� �����Ͽ����ϴ�.");
			}
			
			stmt.close();
			conn.close();
			
		}catch (Exception e) {
			
		}
	}
}











