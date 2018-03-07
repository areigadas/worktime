<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Opened Tasks</title>
<link rel="stylesheet" href="webjars/bootstrap/3.3.6/css/bootstrap.css">
<link rel="stylesheet" href="webjars/bootstrap/3.3.6/css/bootstrap-theme.css">
</head>
<body>
	<h2 class="text-center">Opened Tasks</h2>
	<p class="text-center">${mensagem}</p>
	<div class=" container justify-content-center">
		<div class="col-md-2"></div>
		<div class="col-md-8">
			<div class="panel panel-info">
				<div class="panel-heading">
					<table class="table table-hover">
						<thead>
							<tr>
								<th>Project</th>
								<th>Fase</th>
								<th>Start</th>
								<th>Task</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${openedTasks}" var="timesheet">
								<tr>
									<td>${timesheet.project}</td>
									<td>${timesheet.fase}</td>
									<td><fmt:formatDate pattern="dd/MM/yyyy hh:mm" value="${timesheet.startDate.time}"/></td>
									<td>${timesheet.comment}</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>
		<div class="col-md-2"></div>
	</div>
</body>
</html>