<%-- 
    Document   : email-home
    Created on : 25 mag 2021, 12:40:59
    Author     : amrit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Send email</title>
    </head>
    <body>
        <h2>HI..</h2><br>
        <form:form method="post" action="sending-email" modelAttribute="emailDTO">
            <label for="em">Insert the email: </label>
            <form:input id="em" path="email"/>
            
            <input type="submit" value="send email">
        </form:form>
    </body>
</html>
