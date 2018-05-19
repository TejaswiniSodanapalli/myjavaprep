<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="processdata" modelAttribute="student">
firstName: <form:input path="studentFirstName"/>
<br><br>
Last Name: <form:input path="studentLastName"/>
<br><br>
country:
<form:select path="country">
<form:options items="${studentDAO.getMap}"/> <%--check this why not working --%>
<%-- <form:option value="INR" label="india" />
<form:option value="BRA" label="brazil" />
<form:option value="FRC" label="france" />
<form:option value="US" label="unitedstates" /> --%>
</form:select>
<br><br>
<input type="submit" name="submit"/>
</form:form>
</body>
</html>