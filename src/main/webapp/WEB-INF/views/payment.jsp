<%--
  Created by IntelliJ IDEA.
  User: amrit
  Date: 18/05/21
  Time: 20:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Donation</title>
</head>
<body>
      <h1>Payment page</h1>
      <hr/>

          
      <form:form method="post" action="payment/process" modelAttribute="paymentInfo">
          <p>
              <label for ="cc">Credit Card:</label>
              <form:input id="cc" path="creditCard"/>
              <form:errors path="creditCard"/>
          </p>
          <p>
              <label>Amount and Currency:</label>
              <form:input id="amount" path="amount"/> 
          </p>

          <input type="submit" value="donate">
      </form:form>
</body>
</html>
