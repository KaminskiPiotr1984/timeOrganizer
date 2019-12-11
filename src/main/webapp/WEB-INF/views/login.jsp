<%--
  Created by IntelliJ IDEA.
  User: piotr
  Date: 10.12.2019
  Time: 16:54
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<%@ include file="/WEB-INF/views/header.jsp" %>

<section class="section">
    <div class="container">
        <h1 class="title">
            Login to your account
        </h1>
    </div>
</section>

<section class="section">
    <div class="container">
        <div class="columns">
            <div class="column"></div>
            <div class="column">
                <form method="post" action="/login">
                    <div class="field">
                        <label class="label" for="username">Username</label>
                        <div class="control has-icons-left">
                            <input type="text" id="username" name="username" required class="input"/>
                            <span class="icon is-small is-left">
                                <i class="fas fa-user"></i>
                            </span>
                            <p class="help">Your username</p>
                        </div>
                    </div>
                    <div class="field">
                        <label class="label" for="password">Password</label>
                        <div class="control has-icons-left">
                            <input type="password" id="password" name="password" required class="input"/>
                            <span class="icon is-small is-left">
                                <i class="fas fa-lock"></i>
                            </span>
                            <p class="help">Your password</p>
                        </div>
                    </div>
                    <div class="field">
                        <div class="control">
                            <button class="button is-success is-link" type="submit">Login</button>
                        </div>
                    </div>
                    <%--  Przekazuje unikalny klucz z formualrza - bezpieczeństwo --%>
                    <sec:csrfInput/>
                </form>
            </div>
            <div class="column"></div>
        </div>
    </div>
</section>

<%@ include file="/WEB-INF/views/footer.jsp" %>