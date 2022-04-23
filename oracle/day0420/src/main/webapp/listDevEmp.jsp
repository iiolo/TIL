<%@page import="java.sql.Date"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Developer list</title>
</head>
<body>
	<h2>개발팀 직원 정보</h2>
	<hr>
		<%
		String sql = "select * from emp,dept where dname like '개발%' and emp.dno = dept.dno";
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = 
			DriverManager.getConnection("jdbc:oracle:thin:@192.168.35.217:1521:XE", 
					"c##sist", 
					"sist");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()){
				int eno = rs.getInt(1);
				String ename = rs.getString(2);
				int dno = rs.getInt(3);
				int salary = rs.getInt(4);
				int comm = rs.getInt(5);
				Date hireDate = rs.getDate(6);
				String phone = rs.getString(7);
				String addr = rs.getString(8);
				int mgr = rs.getInt(9);
				String job = rs.getString(10);
				String dname = rs.getString(12);
				String dloc = rs.getString(13);
				

				out.print("<ul>"
							+eno + ", " + ename + ", "
							+ dno + ", " + dname+ ", "+dloc + ", "
							+salary+ ", "+comm + ", "+hireDate+ ", "
							+phone+ ", "+addr+ ", "+mgr+ ", "+job 
							+ "</ul>"
							);
			}
			rs.close();
			stmt.close();
			conn.close();
			
		}catch(Exception e){
			System.out.println("예외발생:"+e.getMessage());
		}
	
		
	%>
</body>
</html>
