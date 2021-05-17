<%-- 
    Document   : index
    Created on : 10 mar 2021, 14:27:28
    Author     : amrit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        
        <style type="text/css">
            .error{
                color: red;
                position : fixed;
                text-align: left;
                margin-left: 30px;
            }
        </style>
        
        <script type="text/javascript">
            function validateForm(){
                var userName=document.getElementById("yn").value;
                if(userName.length <3 || userName.length >15){
                    alert("your username should have between 3 and 15 chars....");
                    return false;
                }
                
                var crushName=document.getElementById("cn").value;
                if(crushName.length <3 || crushName.length >15){
                    alert("your crushName should have between 3 and 15 chars....");
                    return false;
                }
                
                return true;
            }
        </script>
    </head>
    <body>
        <h1 align="center">Love calculator</h1>
        <div align="center"><a href="${pageContext.request.contextPath}/register">registrate</a></div>
        <hr>


        <form:form action="process-homepage" method="get" modelAttribute="userInfo" onsubmit="return validateForm()">
            <div align="center">
                <p>
                    <label for="yn">Your name:</label>
                    <form:input id="yn" path="userName"/>
                    <form:errors path="userName" cssClass="error"/>
                </p>
                <p>
                    <label for="cn">Crush name:</label>
                    <form:input id="cn" path="crushName"/>
                    <form:errors path="crushName" cssClass="error"/>
                </p>
                <p>
                    <form:checkbox id="terms" path="termsAndCondition"/>
                    <label for="terms"> I agree that this is for fun </label>
                    <form:errors path="termsAndCondition" cssClass="error"/>
                </p>
                <input type="submit" value="calculate">
            </div>
        </form:form>
    </body>
</html>
