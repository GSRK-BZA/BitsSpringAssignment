<html>
<head>
    <title>Entity1 List</title>
</head>
<body>
    <h1>List of Entity1 Instances</h1>
    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Description</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="entity1" items="${entity1List}">
                <tr>
                    <td>${entity1.id}</td>
                    <td>${entity1.name}</td>
                    <td>${entity1.description}</td>
                    <td>
                        <a href="<c:url value='/entity1/update/${entity1.id}'/>">Edit</a>
                        <a href="<c:url value='/entity1/delete/${entity1.id}'/>">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <br>
    <a href="<c:url value='/entity1/create'/>">Create New Entity1</a>
</body>
</html>