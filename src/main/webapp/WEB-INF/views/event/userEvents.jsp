<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: piotr
  Date: 12.12.2019
  Time: 13:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All events</title>
    <style>
        .zui-table {
            border: solid 1px #DDEEEE;
            border-collapse: collapse;
            border-spacing: 0;
            font: normal 13px Arial, sans-serif;
        }
        .zui-table thead th, .first {
            background-color: #DDEFEF;
            border: solid 1px #DDEEEE;
            color: #336B6B;
            padding: 10px;
            text-align: left;
            text-shadow: 1px 1px 1px #fff;
        }
        .zui-table tbody td {
            border: solid 1px #DDEEEE;
            color: #333;
            padding: 10px;
            text-shadow: 1px 1px 1px #fff;
        }
    </style>
</head>
<body>

<table class="zui-table">
    <thead>
    <tr>
        <th>User Name</th>
        <th>Lp.</th>
        <th>Description</th>
        <th>Start Time</th>
        <th>End Time</th>
        <th>Repeating</th>


    </tr>
    </thead>
    <tbody>
    <c:forEach items="${events}" var="event" varStatus="stat">
        <tr>
            <td>${event.user.username}</td>
            <td>${stat.count}.</td>
            <td>${event.description}</td>
            <td>${event.startTime}</td>
            <td>${event.endTime}</td>
            <td>${event.repeating}</td>


        </tr>
    </c:forEach>
    </tbody>
</table>
<p>Sztywne dane</p>
</body>
</html>
