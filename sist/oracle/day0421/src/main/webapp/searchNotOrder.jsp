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
<title>주문하지 않은 책 리스트</title>
</head>
<body>
	<form action="searchNotOrder.jsp" method="post">
		고객 이름 : <input type="text" name="name"> 
		<input type="submit" value="입력">
	</form>
	<hr>
	<%
	request.setCharacterEncoding("euc-kr");
	String name = request.getParameter("name");

	if (name != null) {
		String sql = "select * from book b" 
				+ " where b.bookid not in (select o.bookid from orders o"
				+ " where o.custid = (select c.custid from customer c" 
				+ " where name = '"+name+"')) order by b.bookid";
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
			<td>책 번호</td>
			<td>책 이름</td>
			<td>출판사</td>
			<td>원가</td>
		</tr>
		<%
		while (rs.next()) {
			int bookid = rs.getInt(1);
			String bookname = rs.getString(2);
			String publisher = rs.getString(3);
			int price = rs.getInt(4);
			out.print("<tr><td>" + bookid + "</td>" 
						+ "<td>" + bookname+ "</td>" 
						+ "<td>" + publisher + "</td>" 
						+ "<td>" + price + "</td>"
						+ "</tr>");
		}

		rs.close();
		stmt.close();
		conn.close();
		out.print("</table>");
		} catch (Exception e) {
		System.out.println("예외발생:" + e.getMessage());
		}
		}
		%>
	</table>
</body>
</html>