<%@page contentType="text/html" pageEncoding="UTF8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<head>
<meta charset="utf-8"/>
<title>personAdd</title>
</head>

<body>
<form action="add" method="post">
<table border="0">
<tr>
<td>Name</td>
<td>
<input type="text" name="Name" value=""/>
</td>
</tr>
<tr>
<td>Age</td>
<td><input type="text" name="Age" value=""/></td>
</tr>
</table>
<input type="submit" value="Save"/>
<input type="submit" value="Close"/>
</form>
</body>
</html>