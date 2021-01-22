<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ads Index</title>
</head>
<body>
    <h1>Ads!</h1>

    <c:forEach var="ad" items="${ads}">
        <div class="ads">
            <p>${ad.id}</p>
            <h2>${ad.title}</h2>
            <p>${ad.userId}</p>
            <p>${ad.description}</p>
        </div>
    </c:forEach>

</body>
</html>
