<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <a href="/orm/mvcLocation1.do">Location1</a>
  <a href="/orm/mvcLocation2.do">Location2</a>
  
  <form action="/orm/mvcLocation3.do" method="get">
    <input type="text" name="no">
    <input type="text" name="msg">
    <input type="submit" value="Send">
  </form>
  
  <a href="mvcLocation4.do?job=info&no=5">Location4</a>
  <a href="mvcLocation5.do?msg=hi&data=java">Location5</a>

</body>
</html>