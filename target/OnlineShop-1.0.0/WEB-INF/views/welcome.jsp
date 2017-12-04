<%@ page language="java" contentType="text/html; charset=utf-8"  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="shortcut icon" href="/WEB-INF/views/resources/favicon.ico" type="image/x-icon">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="/static/css/bootstrap.min.css">
    <script src="/static/css/jquery-3.2.0.js"></script>
    <script src="/static/css/bootstrap.min.js"></script>
    <style>

        .section a {
            color: white;
            text-transform: uppercase;
            text-decoration: none;
        }

        .title-text {
            text-align: center;
        }

        .button {
            display: inline-block;
            height: 50px;
            line-height: 50px;
            position: relative;
            border: 1px solid white;
            padding: 0 1rem;
        }

        body {
            background: #4cae4c;
        }
    </style>
    <title>Welcome page</title>

</head>

<body>


<div class="section clearfix">
    <div class="title-text">
        <h2>Добро пожаловать</h2>
        <h1>Веб-приложение складского учета<br>
            Приветствует вас</h1>
        <p>Веб-приложение можно использовать, как на предприятиях, так и в магазинах, библиотеках,
            аптеках, и других местах специализированых на поставке товаров.   </p>
        <p>
        Веб-приложение позволяет пользователям: уменьшить время затрачиваемое сотрудниками на ведение документооборота, и доступ к необходимым данным,
        а так же уменьшить зависимость от размера памяти на жестком диске</p>
        <div class="button"><a href="/login">Начать работу</a></div>
    </div>
</div>



<div class="bg-1">
Greeting : ${greeting}
This is a welcome page.

<a href="<c:url value="/login" />">Login</a>


<div>
    <table class="table table-bordered">
        <tr>
            <th>User Name</th>
            <th>Password</th>
            <th>Enabled</th>
            <th align="center" colspan="2" class="action">Action</th>


        </tr>
        <c:forEach items="${usersList}" var="elem">
        <tr>
            <td><c:out value="${elem.username }"/></td>
            <td><c:out value="${elem.password }"/></td>
            <td><c:out value="${elem.enabled }"/></td>
            <td class="action"><a href="dUser/${elem.username}"
                                  class="ico ico-delete">Delete</a>
            <td class="action"><a href="editUser/${elem.username}"
                                  class="ico ico-delete">Edite</a>

                </c:forEach>
        </tr>
    </table>
</div>
<div>
    <table class="table table-bordered">
        <tr>
            <th>idProduct</th>
            <th>Number</th>
            <th>Name</th>
            <th>Client</th>
            <th>Group</th>
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
            <td><c:out value="${elem.Group}"/></td>
            <td><c:out value="${elem.PriceFirst }"/></td>
            <td><c:out value="${elem.Date }"/></td>
            <td><c:out value="${elem.Amount }"/></td>
            <td><c:out value="${elem.PriceA }"/></td>
            <td><c:out value="${elem.Discount }"/></td>
            <td><c:out value="${elem.Store }"/></td>

        </tr>
    </table>
</div>

</div>

</body>
</html>