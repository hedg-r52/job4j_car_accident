<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"                                                    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Car Accidents</title>
</head>
<body>
    <h2>Accidents</h2>
    <table border="1">
        <tr bgcolor="00FF7F">
            <th><b>Id</b></th>
            <th><b>Name</b></th>
            <th><b>Text</b></th>
            <th><b>Address</b></th>
        </tr>
        <c:forEach items="${accidents}" var="accident" varStatus="status">
            <tr>
                <td>${accident.id}</td>
                <td>${accident.name}</td>
                <td>${accident.text}</td>
                <td>${accident.address}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>