package exam01;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
//������ ȸ���� ���̵�, �̸�, ���̸� �Է¹޾� 
//ȸ���� ������ �����ϴ� �ϴ� ���α׷��� �ۼ� �� ���ô�.
//id�� �������� �ʰ� ���ǽĿ� ����ϰ� 
//�� ���ǿ� �´� id�� �ش��ϴ� ȸ���� �̸��� ���̸� �����մϴ�.
import java.util.Scanner;

public class UpdateMember {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			String id, name;
			int age;
			System.out.print("������ ȸ���� ���̵� �Է�==>");
			id = sc.next();
			
			System.out.print(id+"ȸ���� ������ �̸��� �Է�==>");
			name = sc.next();
			
			System.out.print(id+"ȸ���� ������ ���̸� �Է�==>");
			age = sc.nextInt();			
			
			String sql = "update member set name='"+name+"',age="+age+" where id='"+id+"'";
			
			//jdbc����̹��� �޸𸮷� �ε��Ѵ�.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//db������ �����Ѵ�.
			Connection conn = 
			DriverManager.getConnection("jdbc:oracle:thin:@192.168.35.217:1521:XE",
					"c##sist", "sist");
			
			//�����ͺ��̽� ��ɾ �����ϱ� ���� ��ü�� �����Ѵ�.
			Statement stmt = conn.createStatement();
			
			// �����ͺ��̽� ��ɾ �����Ѵ�.
			// executeUpdate
			// executeQuery			
			int re = stmt.executeUpdate(sql);
			if(re == 1) {
				System.out.println(id+"ȸ���� ������ �����Ͽ����ϴ�.");
			}else {
				System.out.println(id+"ȸ���� ���������� �����Ͽ����ϴ�.");
			}
			
			//����ߴ� �ڿ��� �ݾ� �ݴϴ�.
			stmt.close();
			conn.close();
			
		}catch (Exception e) {
			System.out.println("���ܹ߻�:"+e.getMessage());
		}
	}
}









