<%@ page language="java" contentType="text/html; charset=utf-8"  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Welcome page</title>
</head>
<body>
Greeting : ${greeting}
This is a welcome page.

<table>
        <form action="/addUser/" method="post" class="form-horizontal">
            <th>User Name</th>
   <input type="text" class="form-control" id="username" name="ssoId" placeholder="Enter Username" required>
            <td>Password</td>
   <input type="password" class="form-control" id="password" name="password" placeholder="Enter Password" required>

                <input type="submit"
                       class="btn btn-block btn-primary btn-default" value="Log in">

        </form>
    <tr>
        <th>User Name</th>
        <th>Password</th>
        <th>Enabled</th>
        <th class="action">Action</th>
    </tr>
    <c:forEach items="${usersList}" var="elem">
        <tr>
            <td><c:out value="${elem.username }"/></td>
            <td><c:out value="${elem.password }"/></td>
            <td><c:out value="${elem.enabled }"/></td>
            <td class="action"><a href="dUser/${elem.username}"
                                  class="ico ico-delete">Delete</a>
        </tr>
    </c:forEach>
</table>
</body>
</html>