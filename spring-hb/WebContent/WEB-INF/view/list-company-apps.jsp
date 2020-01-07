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
                                        <th>ID</th>
                                        <th>Company</th>
                                        <th>Field</th>
                                        <th>Position</th>
                                </tr>
                                <!-- loop over and print our customers -->
                                <c:forEach var="tempCompApp" items="${companyApps}">

                                        <tr>
                                                <td>${tempCompApp.id}</td>
                                                <td>${tempCompApp.company}</td>
                                                <td>${tempCompApp.positionField}</td>
                                                <td>${tempCompApp.position}</td>
                                        </tr>
                                </c:forEach>
                        </table>
                </div>
        </div>

</body>
</html>