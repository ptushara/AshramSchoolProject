<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css">
.error {
	color: red;
}

table {
	width: 50%;
	border-collapse: collapse;
	border-spacing: 0px;
}

table td {
	border: 1px solid #565454;
	padding: 20px;
}
</style>
</head>
<body>
	<h2>Total Students in School- ${studentCount} </h2> 
	<h2>Students List for every teacher</h2>
	<c:forEach items="${teachers}" var="teacher">
				<img src="data:image/jpeg;base64,${teacher.profileString}" />
			Teacher Name - ${teacher.fullName} , No of Students under teacher - (${teacher.students.size()})
		<br />
		<table>
			<tr>
				<td><strong>Roll No</strong></td>
				<td><strong>Name</strong></td>
				<td><strong>Profile Pic</strong></td>


			</tr>
			<c:forEach items="${teacher.students}" var="student">
				<tr>
					<td>${student.rollNo}</td>
					<td>${student.fullName}</td>
					<td><img src="data:image/jpeg;base64,${student.profileString}" /></td>

				</tr>
			</c:forEach>
		</table>
	</c:forEach>

</body>
</html>