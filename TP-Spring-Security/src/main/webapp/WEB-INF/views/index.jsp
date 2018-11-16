<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>
<!DOCTYPE html>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Spring Security</title>
	</head>
	<body>
		<h3>
		Welcome
			<security:authorize access="isAnonymous()">
				Guest Anonymous
			</security:authorize>
			
			<security:authorize access="isAuthenticated()">
				<security:authentication property="principal.username"/>
			</security:authorize>
		</h3>
		
		<security:authorize access="isAnonymous()">
			Login as <a href="user">User</a> or <a href="admin">Admin</a>
		</security:authorize>
	
	</body>
</html>