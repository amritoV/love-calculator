<%-- 
    Document   : registration
    Created on : 11 mar 2021, 15:22:20
    Author     : amrit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
    </head>
    <body>
        <h1>Love calculator</h1>
        <br>
        <hr>
        <form:form method="post" action="save-registration" modelAttribute="registrationUserDto">
            <p>
                <label for="name">Name:</label>
                <form:input id="name" path="name"/>
            </p>
            <p>
                <label for="userName">User Name:</label>
                <form:input id="userName" path="userName"/>
            </p>
            <p>
                <label for="pass">Password</label>
                <form:password id="pass" path="password"/>
            </p>
            <p>
                <form:select id="country" path="country">
                    <form:option value="Italy" label="Italy"></form:option>
                    <form:option value="India" label="India"></form:option>
                </form:select>
            </p>
            <p>
                <label>hobbys:</label>
                Calcio: <form:checkbox path="hobby" value="calcio"/>
                Leggere: <form:checkbox path="hobby" value="leggere"/>
                Nuotare: <form:checkbox path="hobby" value="Nuotare"/>
            </p>
            <p>
                <label>Gender</label>
                Male: <form:radiobutton path="gender" value="male"/>
                Female: <form:radiobutton path="gender" value="female"/>
                Other: <form:radiobutton path="gender" value="other"/>
            </p>
            <p>
                <label for="age">Age:</label>
                <form:input path="age" id="age"/>
            </p>
            <p>
                <h3>Insert your Communication Details:</h3>
                <label for="email">Email:</label>
                <form:input id="email" path="communicationDto.email"/>
                <label for="phone">Phone:</label>
                <form:input id="phone" path="communicationDto.phone"/>
            </p>
            
            <input type="submit" value="send">
        </form:form>
        
        
        
        
        
    </body>
</html>
