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
                        <h2>Student Applications</h2>
                </div>
        </div>

        <div id="container">
                <div id="content">
                        <!--  add our html table here -->
                        <table>
                                <tr>
                                        <th>ID</th>
                                        <th>Student</th>
                                        <th>Semester</th>
                                        <th>Non Passed Lessons</th>
                                </tr>
                                <!-- loop over and print our customers -->
                                <c:forEach var="tempCompApp" items="${studentApps}">

                                        <tr>
                                                <td>${tempCompApp.id}</td>
                                                <td>${tempCompApp.student}</td>
                                                <td>${tempCompApp.semester}</td>
                                                <td>${tempCompApp.nonPassedLessons}</td>
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