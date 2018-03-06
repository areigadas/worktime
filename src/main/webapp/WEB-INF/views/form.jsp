<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
	<h2>Timesheet</h2>
	<p>${mensagem}</p>
	<form action="<c:url value='form'/>" method="POST">
		<div>
			<label for="employee">Employee:</label> 
			<input type="text" name="employee" id="employee" />
		</div>
		<div>
			<label for="project">Project:</label> 
			<input type="text" name="project" id="project" />
		</div>
		<div>
			<label for="fase">Fase:</label> 
			<input type="text" name="fase" id="fase" />
		</div>
		<div>
			<label for="start">Start:</label> 
			<input type="datetime-local" name="start" id="start" />
		</div>
		<div>
			<label for="task">Task:</label> 
			<input type="text" name="task"id="task" />
		</div>
		<button type="submit">Add</button>
	</form>


</body>
</html>
