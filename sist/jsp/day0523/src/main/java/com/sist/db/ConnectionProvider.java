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
			System.out.println("예외발생"+e.getMessage());
		}
		
		return conn;
	}
	
	// ResultSet, Statement, Connection을 매개변수로 받아 모두 close하는 메소드 생성
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
			System.out.println("예외발생"+e.getMessage());
		}
	}
}
