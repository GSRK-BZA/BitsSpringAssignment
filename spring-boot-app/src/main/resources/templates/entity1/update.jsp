<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update Entity1</title>
</head>
<body>
<h2>Update Entity1</h2>
<form action="${pageContext.request.contextPath}/entity1/update" method="post">
    <input type="hidden" name="id" value="${entity1.id}"/>
    <label for="name">Name:</label>
    <input type="text" id="name" name="name" value="${entity1.name}" required/><br/><br/>
    
    <label for="description">Description:</label>
    <textarea id="description" name="description" required>${entity1.description}</textarea><br/><br/>
    
    <input type="submit" value="Update"/>
</form>
<a href="${pageContext.request.contextPath}/entity1/read">Cancel</a>
</body>
</html>