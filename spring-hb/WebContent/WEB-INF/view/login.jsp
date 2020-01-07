<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="ui segment">

        <h3>Login</h3>
        

        <form:form action="${pageContext.request.contextPath}/authUser" method="POST">
        <div class="field">
                        <label>User Name</label>
                        <input type="text" name="username"/>
                </div>
                <div class="field">
                        <label>Password</label>
                        <input type="password" name="password"/>
                </div>
                <div class="field">
                                <input type="submit" value="Login" />
                        </div>
        </form:form>
        
</div>
</body>
</html>