<%@page contentType="text/html" pageEncoding="UTF8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<head>
<meta charset="utf-8"/>
<title>personDelete</title>
</head>

<body>
<form action="delete" method="post">


<tr>
<td>Name</td>
<td>
<input type="text" name="name" value="<c:out value="${name}"/> - Delete?"/>

</td>
</tr>

</table>
<input type="hidden" name="age" value="<c:out value="${age}"/>"/>
<input type="hidden" name="id" value="<c:out value="${id}"/>"/>
<input type="submit" value="Delete"/>

</form>
<form action="list" method="get">
<input type="submit" value="Cancel"/>
</form>
</body>
</html>