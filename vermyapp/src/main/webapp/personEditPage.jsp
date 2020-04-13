<%@page contentType="text/html" pageEncoding="UTF8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<head>
<meta charset="utf-8"/>
<title>personAdd</title>
</head>

<body>
<form action="edit" method="post">
<table border="0">

<tr>
<td>Name</td>
<td>
<input type="text" name="name" value="<c:out value="${name}"/>"/>
</td>
</tr>
<tr>
<td>Age</td>
<td>
<input type="text" name="age" value="<c:out value="${age}"/>"/>
</td>
</tr>


</table>
<input type="hidden" name="id" value="<c:out value="${id}"/>"/>
<input type="submit" value="Save"/>

</form>
<form action="list" method="get">
<input type="submit" value="Close"/>
</form>
</body>
</html>