<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="Time" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: piotr
  Date: 10.12.2019
  Time: 20:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create new event</title>
    <%-- Elementy dotyczące treści strony --%>
    <%-- Elementy dotyczące wyświetlania --%>
    <meta name="viewport" content="width=device-width; initial-scale=1.0, maximum-scale=1.0"/>

    <%-- Linki do szablonów css trafią tutaj --%>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bulma@0.8.0/css/bulma.min.css">

    <%-- Linki do skryptów js trafią tutaj --%>
    <script defer src="https://use.fontawesome.com/releases/v5.3.1/js/all.js"></script>
</head>
<body>
<%@ include file="/WEB-INF/views/header.jsp" %>


<form:form method="post" modelAttribute="event">
    <p>
        Description: <form:textarea path="description"/><form:errors path="description"/>
    </p>
    <p>
        Start Time:Time: <form:input path="startTime" type="datetime-local"/><form:errors path="startTime"/>
    </p>
    <p>
        End Time: <form:input path="endTime" type="datetime-local"/><form:errors path="endTime"/>
    </p>
    <p>
        Repeating: <form:checkbox path="repeating"/><form:errors path="repeating"/>
    </p>
    <p>
        <input type="submit" value="Ok">
    </p>
</form:form>


</body>
<%@ include file="/WEB-INF/views/footer.jsp" %>
</html>
