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
                        <h2>CRM - Customer Relationship Manager</h2>
                </div>
        </div>

        <div id="container">
                <div id="content">
                        <!--  add our html table here -->
                        <table>
                                <tr>
                                		<th>id</th>
                                        <th>First Name</th>
                                        <th>Last Name</th>
                                        <th>Email</th>
                                </tr>
                                <!-- loop over and print our customers -->
                                <c:forEach var="tempUser" items="${users}">

                                        <tr>
                                        		<td>${tempUser.id}</td>
                                                <td>${tempUser.firstName}</td>
                                                <td>${tempUser.lastName}</td>
                                                <td>${tempUser.email}</td>
                                        </tr>
                                </c:forEach>
                        </table>
                </div>
        </div>

</body>
</html>