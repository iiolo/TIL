package com.sist.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionProvider {
	public static Connection getConnection() {
		Connection conn = null;
		try {
			String driver = "oracle.jdbc.driver.OracleDriver";
			String url = "jdbc:oracle:thin:@211.238.142.98:1521:XE";
			String username = "c##sist";
			String password = "sist";
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			System.out.println("���ܹ߻�"+e.getMessage());
		}
		
		return conn;
	}
	
	// ResultSet, Statement, Connection�� �Ű������� �޾� ��� close�ϴ� �޼ҵ� ����
	public static void close(ResultSet rs, Statement stmt, Connection conn) {
		try {
			if (rs != null) {
				rs.close();
			}
			if(stmt != null) {
				stmt.close();
			}
			
			if(conn != null) {
				conn.close();
			}
			
		} catch (Exception e) {
			System.out.println("���ܹ߻�"+e.getMessage());
		}
	}
}
