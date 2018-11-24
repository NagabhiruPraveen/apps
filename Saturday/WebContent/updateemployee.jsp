<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="for" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<for:form method="post" action="doAddUpdate" modelAttribute="data">
		<table>
			<%-- <tr>
<td>Employee Id</td>
<td><for:input path="empId"/></td>
</tr> --%>

			<tr>
				<td>Doctor Name</td>
				<td><for:input path="dName" /></td>
				<td><for:errors path="dName"></for:errors></td>
			</tr>

			<tr>
				<td>Doctor Salary</td>
				<td><for:input path="salary" /></td>
				<td><for:errors path="salary"></for:errors>
			</tr>

			<tr>
				<td>Doctor Designation</td>
				<td><for:select path="specialization" items="${deg}" /></td>
			</tr>

			<tr>
				<td>Doctor Gender</td>
				<td><for:radiobutton path="dGender" value="male" />Male</td>
				<td><for:radiobutton path="dGender" value="female" />Female</td>
			</tr>
			<tr>
				<td><input type="submit" value="Add Doctor"></input></td>
			</tr>
		</table>

	</for:form>
</body>
</html>