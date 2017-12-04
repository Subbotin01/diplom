
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <link rel="shortcut icon" href="/WEB-INF/views/resources/favicon.ico" type="image/x-icon">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="/static/css/bootstrap.min.css">
    <script src="/static/css/jquery-3.2.0.js"></script>
    <script src="/static/css/bootstrap.min.js"></script>

    <title>Product</title>

</head>
<body>
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
            <th>Group</th>

            <th>Discount</th>
            <th>Store</th>
        </tr>

        <tr>
            <td><c:out value="${elem.idProduct }"/></td>
            <td><c:out value="${elem.Number }"/></td>
            <td><c:out value="${elem.Name }"/></td>
            <td><c:out value="${elem.Client }"/></td>
            <td><c:out value="${elem.PriceFirst }"/></td>
            <td><c:out value="${elem.Group}"/></td>

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
