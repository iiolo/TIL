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
<title>책 리스트</title>
</head>
<body>
	<form action="bookOrderList.jsp" method="post">
		고객 이름 : <input type="text" name="name"> 
		출판사 이름 : <input type="text" name="publisher">
		<input type="submit" value="입력">
	</form>
	<hr>
	<%
	request.setCharacterEncoding("euc-kr");
	String name = request.getParameter("name");
	String publisher = request.getParameter("publisher");
	if (name != null && publisher != null) {
		String sql = "select o.custid, name, publisher, bookname, price, saleprice, orderdate"
					+ " from orders o, book b, customer c" 
					+ " where c.custid = o.custid and b.bookid = o.bookid and name ='"
					+ name + "' and publisher ='" + publisher + "' order by orderdate desc, bookname";
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
			<td>고객 번호</td>
			<td>고객명</td>
			<td>출판사</td>
			<td>책 이름</td>
			<td>원가</td>
			<td>할인가</td>
			<td>구매날짜</td>
		</tr>
		<%
		while (rs.next()) {
			int custid = rs.getInt(1);
			String custName = rs.getString(2);
			String pub = rs.getString(3);
			String bookname = rs.getString(4);
			int price = rs.getInt(5);
			int saleprice = rs.getInt(6);
			Date orderdate = rs.getDate(7);
			out.print("<tr><td>" + custid + "</td>" 
						+ "<td>" + custName + "</td>" 
						+ "<td>" + pub + "</td>" 
						+ "<td>" + bookname+ "</td>" 
						+ "<td>" + price + "</td>" 
						+ "<td>" + saleprice + "</td>"
						+ "<td>" + orderdate + "</td>"
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