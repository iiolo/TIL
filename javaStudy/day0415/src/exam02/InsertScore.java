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

		System.out.print("���� ����� �л��� ��ȣ�� �Է��ϼ���==> ");
		no = sc.nextInt();

		System.out.print("���� ����� �л��� �̸��� �Է��ϼ���==> ");
		name = sc.next();

		System.out.print("���� ����� �л��� ���� ������ �Է��ϼ���==> ");
		ko = sc.nextInt();
		
		System.out.print("���� ����� �л��� ���� ������ �Է��ϼ���==> ");
		en = sc.nextInt();
		
		System.out.print("���� ����� �л��� ���� ������ �Է��ϼ���==> ");
		math = sc.nextInt();

		// �Է¹��� ���̵�,�̸�,���̸� ���� �����ͺ��̽� ��ɾ� ����
		String sql = "insert into student values('" + no + "','" + name + "',' " + ko+ "',' " + en+ "', " + math + ")";

		try {

			// 1. jdbc ����̹��� �޸𸮷� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. db������ ����
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.35.217:1521", "c##sist", "sist");

			// 3. �����ͺ��̽� ����� �����ϱ� ���� ��ü�� ����
			Statement stmt = conn.createStatement();

			// 4. �����ͺ��̽� ����� ����
			stmt.executeUpdate(sql);

			// 5. ����� ���� �ڿ��� �ݱ�
			stmt.close();
			conn.close();

			System.out.println("�л��� ������ ����Ͽ����ϴ�.");

		} catch (Exception e) {
			System.out.println("���ܹ߻�:" + e.getMessage());
		}


	}

}
