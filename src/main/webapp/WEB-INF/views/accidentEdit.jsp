<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Car Accidents</title>
</head>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>
<script
        src="https://code.jquery.com/jquery-3.4.1.min.js"
        integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="
        crossorigin="anonymous"></script>
<body>


<spring:form method="POST" action="/accident/add-accident" modelAttribute="accident">
    <div class="input-group mb-3" style="margin-top: 20px">
        <spring:input type="text" class="form-control" path="name" placeholder="Name"/>
        <spring:input type="text" class="form-control" path="text" placeholder="Text"/>
        <spring:input type="text" class="form-control" path="address" placeholder="Address"/>
        <select name="type.id">
            <c:forEach var="type" items="${types}">
                <option value="${type.id}">${type.name}</option>
            </c:forEach>
        </select>
        <button type="submit" class="btn btn-outline-primary">Add</button>
    </div>
</spring:form>

</body>
</html>