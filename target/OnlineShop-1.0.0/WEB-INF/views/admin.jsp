<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Admin page</title>
</head>
<body>
Dear <strong>${user}</strong>, Welcome to Admin Page.
<button type="button" class="btn btn-danger" href="<c:url value="/logout" />">Danger</button>

<div>
    <table class="table table-bordered">
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

                </c:forEach>
        </tr>
    </table>
</div>
</body>
</html>