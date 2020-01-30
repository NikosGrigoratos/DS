<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>List Customers</title>
<!-- reference our style sheet -->
<link type="text/css" rel="stylesheet"
        href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>
<body>
        <div id="wrapper">
                <div id="header">
                        <h2>Users</h2>
                </div>
        </div>

        <div id="container">
                <div id="content">
                        <!--  add our html table here -->
                        <table>
                                <tr>
                                        <th>ID</th>
                                        <th>Company</th>
                                        <th>Field</th>
                                        <th>Position</th>
                                </tr>
                                <!-- loop over and print our customers -->
                                <c:forEach var="tempUser" items="${users}">

                                        <tr>
                                                <td>${tempUser.id}</td>
                                                <td>${tempUser.username}</td>
                                                <td>${tempUser.firstName}</td>
                                                <td>${tempUser.secondName}</td>
                                                <td>${tempUser.email}</td>
                                                <td>${tempUser.authority}</td>
                                        </tr>
                                </c:forEach>
                        </table>
                </div>
        </div>
        
        <div>
        	<a href="/spring-hb/utilities">Go back to utilities</a>
        </div>

</body>
</html>