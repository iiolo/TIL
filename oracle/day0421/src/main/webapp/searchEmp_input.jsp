<%@page import="org.eclipse.jdt.internal.compiler.ast.WhileStatement"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.servlet.jsp.tagext.TryCatchFinally"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	
	<form action="searchEmp_input.jsp" method="post"> 
		������ �̸� :  <input type="text" name = "mname">
		<input type="submit" value="�������� �˻�">
	</form>
	
	<%
	
	// �̸��� �ѱ۷� ���� ������ �ѱ� ����
	request.setCharacterEncoding("euc-kr");
	
	// ����ڰ� �Է��� ������ �̸��� �޾Ƽ� ������ ����
	String mname = request.getParameter("mname");
	
	// ������ �̸��� null�� �ƴ� �� ������ ���̽� ����
	 if(mname != null){
		 String sql = "select e.ename from emp e, emp m where e.mgr = m.eno and m.ename = '" +mname+"'";
			try{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection conn = 
				DriverManager.getConnection("jdbc:oracle:thin:@192.168.35.217:1521:XE", 
						"c##sist", 
						"sist");
				Statement stmt = conn.createStatement();
				
				// sql ������ �� rs�� ���
				ResultSet rs = stmt.executeQuery(sql);
				
				// rs�� ���ڵ尡 �ִ� ����
				while(rs.next()){
					String ename = rs.getString(1);
					out.print(ename+"<br>");
				}
				rs.close();
				stmt.close();
				conn.close();
				
			}catch(Exception e){
				System.out.println("���ܹ߻�:"+e.getMessage());
			}
	 }
	
	%>
</body>
</html>