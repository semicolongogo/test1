<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
  <!-- <a href="headerAction.do">Click1</a> -->
  <a href="/orm/headerAction.do">Click1</a>
  <a href="/orm/headerAction2.do">Click2</a>
  
  
  <form action="/orm/cookieTest.do">
    <input type="radio" name="color" value="red">red
    <input type="radio" name="color" value="blue">blue
    <input type="radio" name="color" value="cyan">cyan
    <input type="radio" name="color" value="pink">pink
    <button type="submit">Send</button>
  </form>
  <br>
  <form action="/orm/idSessionTest.do">
    id<input type="text" >
    <button type="button">저장</button>
  </form>
  

</body>
</html> 