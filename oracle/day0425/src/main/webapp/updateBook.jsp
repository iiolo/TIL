<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 수정</title>
</head>
<body>
	<h2>도서 수정</h2>
	<hr>
	<form action="updateBook.jsp" method="post">
		도서번호 : <input type="text" name="bookid"><br>
		도서가격 : <input type="text" name="price"><br>
		<input type="submit" value="등록">
	</form>
	<hr>
	<br>
	
	<table  border= "1" style="border-collapse:collapse; border-spacing:0; border-color:black;">
		<tr>
			<td>책 번호</td>
			<td>책 이름</td>
			<td>출판사</td>
			<td>원가</td>
		</tr>
	<%
		request.setCharacterEncoding("utf-8");
		try{
			
			if(request.getParameter("bookid") != null){
				
				int bookid = Integer.parseInt(request.getParameter("bookid"));

				int price = Integer.parseInt( request.getParameter("price"));
				
				String sql = "update book set price = "+price+" where bookid = "+bookid;
				
				Class.forName("oracle.jdbc.driver.OracleDriver");
				String url = "jdbc:oracle:thin:@192.168.35.217:1521:XE";
				String user = "c##sist";
				String pwd = "sist";
				Connection conn = DriverManager.getConnection(url, user, pwd);
				Statement stmt = conn.createStatement();
				
				int re = stmt.executeUpdate(sql);
				
				if(re == 1){
					String sql2 = "select * from book where bookid = "+bookid;
					ResultSet rs = stmt.executeQuery(sql2);
					while (rs.next()) {
						int bookId = rs.getInt(1);
						String bookName = rs.getString(2);
						String pub = rs.getString(3);
						int bookprice = rs.getInt(4);
						out.print("<tr><td>" + bookId + "</td>" 
									+ "<td>" + bookName + "</td>" 
									+ "<td>" + pub + "</td>" 
									+ "<td>" + bookprice+ "</td></tr>");

					}
				}else{
					out.print("도서 수정에 실패하였습니다.");
				}
				
				stmt.close();
				conn.close();
			}
			
			
			
		}catch(Exception e){
			System.out.println("예외발생:"+e.getMessage());
		}
	%>
	</table>
</body>
</html>
