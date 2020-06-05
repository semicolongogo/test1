<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%-- List	<h1>${strMsg}</h1>
String	<h1>${msg}</h1> --%>


<%-- map${map}
bean${param}--%>

<%-- NO:${param.no }
JOB:${param.job } --%>

MSG : ${param.msg } <%-- = <%=request.getParameter("msg") %> --%>
DATA : ${param.data }


</body>
</html>