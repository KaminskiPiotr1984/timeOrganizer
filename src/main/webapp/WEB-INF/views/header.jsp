<%--
  Created by IntelliJ IDEA.
  User: piotr
  Date: 10.12.2019
  Time: 21:57
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="set" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>timeOrganizer</title>

    <%-- Elementy dotyczące treści strony --%>
    <%--    <meta name="description"--%>
    <%--          content="Projekt Spring Transitions zawierający zbiór przekształceń projektów opartych na Spring Boot 2 do nowych wersji"/>--%>
    <%--    <meta name="keywords" content="Spring,boot,java,jsp,project,code"/>--%>
    <meta name="author" content="Piotr Kamiński, https://github.com/Kaminskipiotr1984"/>
    ​
    <%-- Elementy dotyczące wyświetlania --%>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0"/>
    ​
    <%-- Linki do szablonów css trafią tutaj --%>
    <link rel="stylesheet" href="/webjars/bulma/0.7.5/css/bulma.min.css">

    <%-- Linki do skryptów js trafią tutaj --%>
    <script defer src="/webjars/font-awesome/5.10.1/js/all.min.js"></script>

</head>

<body class="has-navbar-fixed-top">
<header>
    <nav class="navbar is-fixed-top" role="navigation" aria-label="main navigation">
        <div class="container">
            <div class="navbar-menu">
                <div class="navbar-start">
                    <a class="navbar-item" href="/">Start page</a>
                    <%-- Tutaj pozostałe linki, które chcemy mieć widoczne --%>
                    <div class="navbar-item has-dropdown is-hoverable">
                        <a class="navbar-link">More actions</a>
                        <div class="navbar-dropdown">
                            <a class="navbar-item" href="/event/create">Create new Event</a>
                            <a class="navbar-item">Empty link 2</a>
                            <a class="navbar-item">Empty link 3</a>
                            <a class="navbar-item">Empty link 4</a>
                        </div>
                    </div>
                </div>

                ​<div class="navbar-center">
                <c:if test="${pageContext.request.userPrincipal.authenticated}">
                    <div class="content has-text-centered">
                        <p><strong>Hello ${pageContext.request.userPrincipal.name}!</strong></p>
                    </div>
                </c:if>
            </div>

                <div class="navbar-end">
                    <div class="navbar-item">
                        <div class="buttons">
<%--                            <c:if test="${not pageContext.request.userPrincipal.authenticated}">--%>
<%--                                <a class="button is-primary" href="/register"><strong>Register</strong></a>--%>
<%--                                <a class="button is-success" href="/login"><strong>Login</strong></a>--%>
<%--                            </c:if>--%>
                                                       <sec:authorize access="!isAuthenticated()">
                                                            <a class="button is-primary" href="/register"><strong>Register</strong></a>
                                                            <a class="button is-success" href="/login"><strong>Login</strong></a>
                                                        </sec:authorize>
                            <%--  Wyświetla przyciski jeżeli zweryfikowany (zalogowany) jest użytkownik
                                  Je st to weryfikacja ścieżki --%>
<%--                            <c:if test="${pageContext.request.userPrincipal.authenticated}">--%>
<%--                                <a class="button is-primary" href="/user"><strong>Your account</strong></a>--%>
<%--                                <form method="post" action="/logout">--%>
<%--                                    <button class="button is-link" type="submit">Logout</button>--%>
<%--                                    <set:csrfInput/>--%>
<%--                                </form>--%>
<%--                            </c:if>--%>
                                                        <sec:authorize access="isAuthenticated()">
                                                            <a class="button is-primary" href="/user"><strong>Your account</strong></a>
                                                            <form method="post" action="/logout">
                                                                <button class="button is-link" type="submit">Logout</button>
                                                                <set:csrfInput/>
                                                            </form>
                                                        </sec:authorize>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </nav>
</header>