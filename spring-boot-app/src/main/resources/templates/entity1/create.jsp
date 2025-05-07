<attachment id="file:/spring-boot-app/spring-boot-app/src/main/resources/templates/entity1/create.jsp">
<form action="${pageContext.request.contextPath}/entity1/save" method="post">
    <h2>Create Entity1</h2>
    <label for="name">Name:</label>
    <input type="text" id="name" name="name" required>
    <br>
    <label for="description">Description:</label>
    <textarea id="description" name="description" required></textarea>
    <br>
    <input type="submit" value="Create">
</form>
<a href="${pageContext.request.contextPath}/entity1/read">Back to List</a>
</attachment>