<html>
<head>
    <title>Entity2 List</title>
</head>
<body>
    <h1>Entity2 List</h1>
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
            <c:forEach var="entity2" items="${entity2List}">
                <tr>
                    <td>${entity2.id}</td>
                    <td>${entity2.name}</td>
                    <td>${entity2.description}</td>
                    <td>
                        <a href="<c:url value='/entity2/update/${entity2.id}'/>">Edit</a>
                        <a href="<c:url value='/entity2/delete/${entity2.id}'/>">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <br>
    <a href="<c:url value='/entity2/create'/>">Create New Entity2</a>
</body>
</html>