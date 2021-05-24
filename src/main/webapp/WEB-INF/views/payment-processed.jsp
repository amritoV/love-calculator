<%-- 
    Document   : payment-processed
    Created on : 19 mag 2021, 11:57:37
    Author     : amrit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Bill</h1>
        <div align="center"><a href="${pageContext.request.contextPath}/home">home page</a></div>
        <hr>
        <p>
            Bill against the credit Card number ${paymentInfo.creditCard} <br>
            for an amount of ${paymentInfo.amount} has been generated
        </p>
    </body>
</html>
