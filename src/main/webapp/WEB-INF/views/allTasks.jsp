<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Tasks</title>
<link rel="stylesheet" href="webjars/bootstrap/3.3.6/css/bootstrap.css">
<link rel="stylesheet" href="webjars/bootstrap/3.3.6/css/bootstrap-theme.css">
</head>
<body>
<div class="container">
	<div class="row">
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
										<td><fmt:formatDate pattern="dd/MM/yyyy HH:mm" value="${timesheet.startDate.time}"/></td>
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
									<th>End</th>
									<th>Hours</th>
									<th>Task</th>
								</tr>
							</thead>
							<tbody id="finishedTasks">
								<c:forEach items="${allTasks}" var="timesheet">
									<tr>
										<td>${timesheet.project}</td>
										<td>${timesheet.fase}</td>
										<td class="start"><fmt:formatDate pattern="dd/MM/yyyy HH:mm" value="${timesheet.startDate.time}"/></td>
										<td class="finish"><fmt:formatDate pattern="dd/MM/yyyy HH:mm" value="${timesheet.endDate.time}"/></td>										
										<td class="totalHours"></td>
										<td>${timesheet.comment}</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</div>
			<div class="col-md-2 "></div>
		</div>
	</div>
	 <div class="row">
		<div class="container">
			<form action="${s:mvcUrl('TC#home').build()}">
				<button type="submit" class="btn btn-success">Home</button>
			</form>
		</div>
	</div>
</div>
<script type="text/javascript" src="<c:url value='/resources/js/general.js' />"></script>
</body>
</html>