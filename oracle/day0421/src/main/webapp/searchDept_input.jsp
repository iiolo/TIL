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
<title>Insert title here</title>
</head>
<body>
	<form action="searchEmpFromDname.jsp" method="post">
		부서이름 : <input type="text" name="dname">
		<input type="submit" value="직원검색">
	</form>
	<hr>
	<%
		request.setCharacterEncoding("euc-kr");
		String dname = request.getParameter("dname");
		
		String sql = "select ename from emp, dept where emp.dno = dept.dno and dname = '"+dname+"'";
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@192.168.35.217:1521:1521:XE";
			String user = "c##sist";
			String pwd = "sist";
			Connection conn = DriverManager.getConnection(url, user, pwd);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				String ename = rs.getString(1);
				out.print(ename + "<br>");
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