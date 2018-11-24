<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Deg</th>
			<th>Salary</th>
			<th>Gender</th>
		</tr>
		<tr>
			<td>${data.dId}</td>
			<td>${data.dName}</td>
			<td>${data.specialization}</td>
			<td>${data.salary}</td>
			<td>${data.dGender}</td>
		</tr>
		<tr>
		<td>
		<br><a href="update">Update</a>
		</td>
		</tr>
	</table>
</body>
</html>