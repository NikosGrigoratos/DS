<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
User Utilities:
<br/>
<a href = "<c:url value = "/studentApps/list"/>">show student applications</a> 
<br/>
<a href = "<c:url value = "/companyApps/list"/>">show company applications</a>
<br/>
<a href = "<c:url value = "/studentApps/delete"/>">delete student application</a>
<br/>
<a href = "<c:url value = "/companyApps/delete"/>">delete company application</a>
<br/>
<a href = "<c:url value = ""/>">assign job to student</a>
<br/>
<sec:authorize access="hasRole('ADMIN')">
Admin Utilities:
<br/>
<a href = "<c:url value = "/user/list"/>">show Users</a>
<br/>
<a href = "<c:url value = "/user/delete"/>">delete user</a>
<br/>
<a href = "<c:url value = "/user/add"/>">add user</a>
</sec:authorize>
</body>
</html>