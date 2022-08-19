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

			// 1. jdbc ����̹��� �޸𸮷� �ε��Ѵ�.
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. db������ �����Ѵ�.
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.35.217:1521", "c##sist", "sist");

			// 3. �����ͺ��̽� ����� �����ϱ� ���� ��ü�� �����մϴ�.
			Statement stmt = conn.createStatement();

			// 4. �����ͺ��̽� ����� �����Ѵ�.
			// executeUpdate : �����ͺ��̽��� ������ �ִ� ����� ������ �� ���
			// executeQuery : �����ͺ��̽��κ��� �о���� ����� ������ �� ���
			ResultSet rs = stmt.executeQuery(sql); // �о�� ����� ResultSet ��ü�� ��´�
			
			// 5. �о�� �����͸�ŭ �ݺ� ����
			while (rs.next()) { // �����Ͱ� �ִ� ��ŭ �ݺ� ����
				String id = rs.getString(1); // Ŀ���� �ٶ󺸰� �ִ� 1��° 
				String name = rs.getString(2); // Ŀ���� �ٶ󺸰� �ִ� 2��° 
				int age = rs.getInt(3); // Ŀ���� �ٶ󺸰� �ִ� 3��°
				
				System.out.println("���̵�: "+id);
				System.out.println("�̸�: "+name);
				System.out.println("����: "+age);
				System.out.println("-------------------------");
				
				
			}
			
			// 6. ����� ���� �ڿ��� �ݾ� �ݴϴ�.
			stmt.close();
			conn.close();

			System.out.println("ȸ���� ������ ����Ͽ����ϴ�.");

		} catch (Exception e) {
			System.out.println("���ܹ߻�:" + e.getMessage());
		}

	}
}
