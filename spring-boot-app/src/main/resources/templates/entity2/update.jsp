<attachment id="file:/spring-boot-app/spring-boot-app/src/main/resources/templates/entity2/update.jsp">
<form action="${pageContext.request.contextPath}/entity2/update" method="post">
    <h2>Update Entity2</h2>
    <input type="hidden" name="id" value="${entity2.id}" />
    
    <label for="name">Name:</label>
    <input type="text" id="name" name="name" value="${entity2.name}" required />
    
    <label for="description">Description:</label>
    <textarea id="description" name="description" required>${entity2.description}</textarea>
    
    <button type="submit">Update</button>
    <a href="${pageContext.request.contextPath}/entity2/read">Cancel</a>
</form>
</attachment>