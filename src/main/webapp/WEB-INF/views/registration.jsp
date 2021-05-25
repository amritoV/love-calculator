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
        <style type="text/css">
            .error{
                color: red;
                position : fixed;
                text-align: left;
                margin-left: 30px;
            }
        </style>
        
        
        
    </head>
    
    
    <body>
        <h1>Love calculator</h1>
        <br>
        <hr>
        <form:form method="post" action="save-registration" modelAttribute="registrationUserDto">
            <p>
                <label for="name">Name:</label>
                <form:input id="name" path="name"/>
                <form:errors path="name" cssClass="error"/>
            </p>
            <p>
                <label for="userName">User Name:</label>
                <form:input id="userName" path="userName"/>
                <form:errors path="userName" cssClass="error"/>
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
                <form:errors path="age" cssClass="error"/>
            </p>
            <p>
                <h3>Insert your Communication Details:</h3>
                <label for="email">Email:</label>
                <form:input id="email" path="communicationDto.email"/>
                <form:errors path="communicationDto.email" cssClass="error"/><br>
                <label for="phone">Phone:</label>
                <form:input id="phone" path="communicationDto.phone"/>
                <form:errors path="communicationDto.phone" cssClass="error" />
            </p>
            
            <input type="submit" value="send">
        </form:form>
        
        
        
        
        
    </body>
</html>
