<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>게시물 등록</h2>
<hr>

	<form action="InsertBoard" method="post">
		글제목 : <br>
		<input type="text" name="title"><br><br>
		
		작성자 : <br>
		<input type="text" name="writer"><br><br>
		
		비밀번호 :<br>
		<input type="password" name="pwd"><br><br>
		
		내용 : <br>
		<textarea rows="10" cols="80" name="content"></textarea><br><br>
		
		<input type="submit" value="등록">
		&nbsp;&nbsp;
		<input type="reset" value="다시입력">
	</form>
</body>
</html>