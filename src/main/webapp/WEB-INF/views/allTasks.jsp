<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>All Tasks</title>
<link rel="stylesheet" href="webjars/bootstrap/3.3.6/css/bootstrap.css">
<link rel="stylesheet" href="webjars/bootstrap/3.3.6/css/bootstrap-theme.css">
</head>
<body>
	<h3 class="text-center">Opened Tasks</h3>
	<div class=" container justify-content-center">
		<div class="col-md-2"></div>
		<div class="col-md-8">
			<div class="panel panel-warning">
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
	<hr>
	<h3 class="text-center">All Tasks</h3>
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
							<c:forEach items="${allTasks}" var="timesheet">
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