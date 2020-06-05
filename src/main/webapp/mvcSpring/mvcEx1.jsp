<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src=" https://code.jquery.com/jquery-3.5.0.min.js"></script>
<script type="text/javascript">
   $(function(){
	   $("input#send").click(function(){
		  $("form").submit(); 
	   });
   });
</script>
</head>
<body>
    <!-- <form action="input.do" method="post">
      <input type="text" name="name">
      <input type="text" name="age">
      <input type="button" value="Send" id="send">
    </form> -->
    
    <a href="/orm/location.do">LOCATION1</a>
    <a href="/orm/location.do">LOCATION2</a>
</body>
</html>














