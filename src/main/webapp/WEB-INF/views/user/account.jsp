<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: piotr
  Date: 10.12.2019
  Time: 16:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<%@ include file="/WEB-INF/views/header.jsp" %>

<section class="hero is-bold is-medium">
    <div class="container">
        <div class="hero-body">
            <h1 class="title">
                Welcome
            </h1>
            <h2 class="subtitle">
                ${pageContext.request.userPrincipal.name}!
            </h2>
        </div>
    </div>
</section>

<%@ include file="/WEB-INF/views/footer.jsp" %>