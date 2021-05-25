<%-- 
    Document   : email-sent
    Created on : 25 mag 2021, 12:46:37
    Author     : amrit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>email sent</title>
    </head>
    <body>
        <h1 align="center">Love Calculator</h1><br>
        <div align="center"> <a href="${pageContext.request.contextPath}/home">Home Page</a></div>
        <hr>
        <h2> HI..</h2><br>
        <p align="center">Email has been sent to ${emailDTO.email}</p>
    </body>
</html>
