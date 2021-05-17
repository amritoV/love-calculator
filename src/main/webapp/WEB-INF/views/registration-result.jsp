<%-- 
    Document   : registration-result
    Created on : 11 mar 2021, 15:56:22
    Author     : amrit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>reg-result</title>
    </head>
    <body>
        <h1 align="center">Love calculator</h1><br>
        <div align="center"><a href="${pageContext.request.contextPath}/home">home page</a></div>
        <hr>
        <p>
            name: ${registrationUserDto.name}<br>
            user name: ${registrationUserDto.userName}<br>
            password: ${registrationUserDto.password}<br>
            country: ${registrationUserDto.country}<br>
            hobbies: ${registrationUserDto.hobby} <br>
            gender: ${registrationUserDto.gender}<br>
        </p>
    </body>
</html>
