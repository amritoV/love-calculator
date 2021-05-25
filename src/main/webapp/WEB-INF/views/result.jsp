<%-- 
    Document   : result
    Created on : 11 mar 2021, 11:25:10
    Author     : amrit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 align="center">Love Calculator</h1><br>
        <div align="center"> <a href="${pageContext.request.contextPath}/email-home">Send the result via email</a></div>
        <hr>
        <h2> HI ...</h2><br>
        <h2 align="center">Love Calculator Result: </h2>
        <p align="center">
            ${userInfo.userName} and ${userInfo.crushName} are:<br>
            FRIENDS
        </p>
    </body>
</html>
