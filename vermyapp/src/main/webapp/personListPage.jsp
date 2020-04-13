<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
    <body>
        <table>
            <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Age</th>
            </tr>
<c:forEach var = "person" items = "${personList}">
<tr>
<td><c:out value="${person.id}"/></td>
<td><c:out value="${person.name}"/></td>
<td><c:out value="${person.age}"/></td>
<td>
<form action="edit" method="get">
    <input type="hidden" name="id"  value="<c:out value="${person.id}"/>">
    <input type="hidden" name="name"  value="<c:out value="${person.name}"/>">
    <input type="hidden" name="age"  value="<c:out value="${person.age}"/>">
    <input type="submit" name="edit"  value="Edit">
</form>
</td>

<td>
<form action="delete" method="get">
    <input type="hidden" name="id"  value="<c:out value="${person.id}"/>">
    <input type="hidden" name="name"  value="<c:out value="${person.name}"/>">
    <input type="hidden" name="age"  value="<c:out value="${person.age}"/>">
    <input type="submit" name="delete"  value="Delete">
</form>
</td>

</tr>
</c:forEach>
</table>
<form action="add" method="get">
<input type="submit" value="Add"/>
</form>
</body>