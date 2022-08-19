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
<title>고객 예약 리스트</title>
</head>
<body>
	<form action="searchReservation.jsp" method="post">
		고객 이름 : <input type="text" name="cname"> 
		<input type="submit" value="입력">
	</form>
	<hr>
	<%
	request.setCharacterEncoding("euc-kr");
	String cname = request.getParameter("cname");

	
	if (cname != null) {
		String sql = "select * from reservation"
					+" where cno = (select cno from cust" 
					+" where cname = '"+cname+"')";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@192.168.35.217:1521:XE";
			String user = "c##sist";
			String pwd = "sist";
			Connection conn = DriverManager.getConnection(url, user, pwd);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
	%>

	<table  border= "1" style="border-collapse:collapse; border-spacing:0; border-color:black;">
		<tr>
			<td>극장 번호</td>
			<td>상영관 번호</td>
			<td>고객 번호</td>
			<td>좌석 번호</td>
			<td>날짜</td>
		</tr>
		<%
		while (rs.next()) {
			int tno = rs.getInt(1);
			int pno = rs.getInt(2);
			int cno = rs.getInt(3);
			int seat = rs.getInt(4);
			Date rdate = rs.getDate(5);
			out.print("<tr><td>" + tno + "</td>" 
						+ "<td>" + pno+ "</td>" 
						+ "<td>" + cno + "</td>" 
						+ "<td>" + seat + "</td>"
						+ "<td>" + rdate + "</td>"
						+ "</tr>");
		}

		rs.close();
		stmt.close();
		conn.close();
		} catch (Exception e) {
		System.out.println("예외발생:" + e.getMessage());
		}
		}
		%>
	</table>
</body>
</html>