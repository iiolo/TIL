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
<title>사원 추가</title>
</head>
<body>
	<form action="insertEmp.jsp" method="post">
		사원 이름 : <input type="text" name="ename"> 
		부서 번호 : <input type="text" name="dno"> 
		월급 : <input type="text" name="salary"> 
		시급 : <input type="text" name="comm"> 
		고용날짜 : <input type="text" name="hiredate"> 
		핸드폰 : <input type="text" name="phone"> 
		주소 : <input type="text" name="addr"> 
		관리자번호 : <input type="text" name="mgr"> 
		직급 : <input type="text" name="job"> 
		이메일: <input type="text" name="email"> 
		주민번호: <input type="text" name="jumin"> 
		<input type="submit" value="입력">
	</form>
	<hr>
	<%
	request.setCharacterEncoding("euc-kr");
	String ename = request.getParameter("ename");
	int dno = Integer.parseInt(request.getParameter("dno"));
	int salary = Integer.parseInt(request.getParameter("salary"));
	int comm = Integer.parseInt(request.getParameter("comm"));
	String hiredate = request.getParameter("hiredate");
	String phone = request.getParameter("phone");
	String addr = request.getParameter("addr");
	int mgr = Integer.parseInt(request.getParameter("mgr"));
	String job = request.getParameter("job");
	String email = request.getParameter("email");
	String jumin = request.getParameter("jumin");


	if (ename != null) {
		String sql = "insert into emp values(nvl(select max(eno) from emp,0) + 1, '"
						+ename+"', "+dno+", "+salary+", "+comm+", '"+hiredate+"', '"
						+ phone+"', '"+addr+"', '"+job+"', '"+email+"', '"+jumin+"')" ;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@192.168.35.217:1521:XE";
			String user = "c##sist";
			String pwd = "sist";
			Connection conn = DriverManager.getConnection(url, user, pwd);
			Statement stmt = conn.createStatement();
			stmt.executeQuery(sql);
			

		stmt.close();
		conn.close();
		} catch (Exception e) {
		System.out.println("예외발생:" + e.getMessage());
		}
	}
%>
</body>
</html>