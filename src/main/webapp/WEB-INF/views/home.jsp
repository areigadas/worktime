<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
<!DOCTYPE html>
<html>
<head>
  <link rel="stylesheet" href="webjars/bootstrap/3.3.6/css/bootstrap.css">
  <link rel="stylesheet" href="webjars/bootstrap/3.3.6/css/bootstrap-theme.css">
<meta charset="UTF-8">
<title>Timesheet System</title>
</head>
<body>
	<h1 class="text-center">Timesheet - Main menu</h1>
	<div class="container">
		<div class="col-md-4"></div>
		<div class="col-md-4">
			<div class="panel panel-info">
				<div class="panel-heading">
					<div class=" text-center"><form action="<c:url value='/form'/>" method="GET">    
						<button class="btn btn-success btn-lg btn-block" type="submit" id="start">START</button></form>
					</div>
					<div class=" text-center"><form action="<c:url value='/form'/>" method="POST">   
						<button  class="btn btn-warning btn-lg btn-block" type="submit" id="finish">FINISH</button></form>
					</div>
					<div class=" text-center"><form action="<c:url value='/allTasks'/>" method="GET">
						<button class="btn btn-info btn-lg btn-block" type="submit" id="list">LIST</button></form>
					</div>
				</div>
			</div>
		</div>
		<div class="col-md-4"></div>
	</div>
</body>
</html>