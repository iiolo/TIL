package exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ListMember {
	public static void main(String[] args) {		

		//�����ϰ��� �ϴ� �����ͺ��̽� ��ɾ ������ �����Ѵ�.
		String sql = "select * from member";		
		try {
			
			//jdbc����̹��� �޸𸮷� �α��Ѵ�.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//DB������ �����մϴ�.
			Connection conn = 
			DriverManager.getConnection("jdbc:oracle:thin:@192.168.35.217:1521:XE", 
					"c##sist", "sist");
			
			//�����ͺ��̽� ����� �����ϱ� ���� ��ü�� �����մϴ�.
			Statement stmt = conn.createStatement();
			
			// �����ͺ��̽� ��ɾ �����մϴ�.
			// executeUpdate	==> �����ͺ��̽��� ������ ����� ������ �� ���.
			// executeQuery		==> �����ͺ��̽��� �ڷḦ ��ȸ�� �� ���.
			ResultSet rs  = stmt.executeQuery(sql);
			
			//�˻��� ����� �ڷᰡ �ִ� ��ŭ �ݺ� �����մϴ�.	
			//rs.next()�� �������ڵ带 Ŀ���� �Ű��ְ�  true��ȯ�մϴ�.
			//���̻� �Ű��� ���ڵ尡 ������ false�� ��ȯ�մϴ�.
			while(rs.next()) {
				
				//����Ŀ���� ����Ű�� �ִ� ���� ���� ���� ����
				//rs.getXXX(�ε���)
				//�÷��� �ε����� 1���� �����մϴ�.
				//XXX���� ���ڿ��̴� String �����̸� Int
				String id = rs.getString(1);
				String name = rs.getString(2);
				int age = rs.getInt(3);
				
				System.out.println(id + ","+  name + "," + age);
				
			}
			
			System.out.println("��� ����Ͽ����ϴ�.");
			System.out.println("---------------------------------------------");
			
			// ����ߴ� �ڿ��� �ݾ� �ݴϴ�.
			// ���� ���߿� ������� �ڿ����� �ݾ� �ݴϴ�.
			rs.close();
			stmt.close();
			conn.close();
			
		}catch (Exception e) {
			System.out.println("���ܹ߻�:"+e.getMessage());
		}
	}
}		












