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
		
		System.out.print("����� ȸ���� ���̵� �Է�==>");
		id = sc.next();
		System.out.print("����� ȸ���� �̸��� �Է�==>");
		name = sc.next();		
		System.out.print("����� ȸ���� ���̸� �Է�==>");
		age = sc.nextInt();
		
		String sql = "insert into member values('"+id+"', '"+name+"', "+age+")";		
		try {
			//jdbc����̹��� �޸𸮷� �ε��Ѵ�.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//DB ������ �����Ѵ�.
			Connection conn = 
			DriverManager.getConnection("jdbc:oracle:thin:@211.238.142.98:1521:XE", 
					"c##sist", "sist");
			
			//�����ͺ��̽� ����� �����ϱ� ���� ��ü�� ����
			Statement stmt = conn.createStatement();
			
			// �����ͺ��̽� ��ɾ �����մϴ�.
			// executeUpdate  ==> �����ͺ��̽��� ������ �ִ� ����� ������ ���� ���
			// executeQuery   ==> �����ͺ��̽��� ������ ��ȸ�ϴ� ����� ������ ���� ���
			int re = stmt.executeUpdate(sql);
			//���������� ����� ������ ���ڵ��� ���� ��ȯ
			
			if(re == 1) {
				System.out.println("ȸ���� ������ �߰��Ͽ����ϴ�.");
			}else {
				System.out.println("ȸ������ �߰��� �����Ͽ����ϴ�.");
			}
			
			//����ߴ� �ڿ��� �ݾ� �ݴϴ�.
			stmt.close();
			conn.close();
			
		}catch (Exception e) {
			System.out.println("���ܹ߻�:"+e.getMessage());
		}
		
	}
}
