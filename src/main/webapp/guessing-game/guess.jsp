<%--
  Created by IntelliJ IDEA.
  User: Eleanor
  Date: 1/21/21
  Time: 3:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guess a Number</title>
</head>
<body>
<form method="post" action="/guess">
    <h1>Guess a number between 1 and 3</h1>
    <input type="text" name="guessnumber" placeholder="Enter your number">
    <div>
        <input type="submit">
    </div>


</form>
</body>
</html>
