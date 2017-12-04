<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>DBA page</title>
</head>
<body>
Dear <strong>${user}</strong>, Welcome to DBA Page.
<a href="<c:url value="/logout" />">Logout</a>

<div>
    <table class="table table-bordered">
        <tr>
            <th>idProduct</th>
            <th>Number</th>
            <th>Name</th>
            <th>Client</th>
            <th>PriceFirst</th>
            <th>Date</th>
            <th>Amount</th>
            <th>PriceA</th>
            <th>Discount</th>
            <th>Store</th>
        </tr>

        <tr>
            <td><c:out value="${elem.idProduct }"/></td>
            <td><c:out value="${elem.Number }"/></td>
            <td><c:out value="${elem.Name }"/></td>
            <td><c:out value="${elem.Client }"/></td>
            <td><c:out value="${elem.PriceFirst }"/></td>
            <td><c:out value="${elem.Date }"/></td>
            <td><c:out value="${elem.Amount }"/></td>
            <td><c:out value="${elem.PriceA }"/></td>
            <td><c:out value="${elem.Discount }"/></td>
            <td><c:out value="${elem.Store }"/></td>

        </tr>
    </table>
</div>



</body>
</html>