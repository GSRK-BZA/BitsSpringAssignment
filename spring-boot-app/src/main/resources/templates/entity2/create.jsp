<attachment id="file:/spring-boot-app/spring-boot-app/src/main/resources/templates/entity2/create.jsp">
<form action="${pageContext.request.contextPath}/entity2/save" method="post">
    <h2>Create Entity2</h2>
    <label for="name">Name:</label>
    <input type="text" id="name" name="name" required>
    
    <label for="description">Description:</label>
    <input type="text" id="description" name="description" required>
    
    <input type="submit" value="Create">
</form>
<a href="${pageContext.request.contextPath}/entity2/read">Back to List</a>
</attachment>