<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<html>
<head>
<link rel="stylesheet" href="webjars/bootstrap/3.3.6/css/bootstrap.css">
<link rel="stylesheet" href="webjars/bootstrap/3.3.6/css/bootstrap-theme.css">
<script type="text/javascript" src="webjars/bootstrap/3.3.6/js/bootstrap.js"></script>  
</head>
<body>
	<h2 class="text-center">Timesheet</h2>

	<div class=" container justify-content-center">
		<div class="col-md-4"></div>
		<div class="col-md-4">
			<div class="panel panel-info">
				<div class="panel-heading">
					<form:form  action="${s:mvcUrl('TC#addTimesheet').build() }" method="POST" modelAttribute="timesheet">
						<div class="row form-group">
							<label for="employee">Employee:</label>
							<form:input class="form-control" path="employee" id="employee" value="Adriana" />
							<small id="employeeHelp" class="form-text text-muted"></small>
						</div>
						<div class="row form-group">
							<label for="project">Project:</label>
							<form:select class="form-control"  path="project" id="project">
								<form:option value="Spring">Spring</form:option>
								<form:option value="Webservice">Webservice</form:option>
								<form:option value="Angular2">Angular2</form:option>
							</form:select>
						</div>
						<div class="row form-group">
							<label for="fase">Fase:</label>
							<form:select class="form-control"  path="fase" id="fase">
								<form:option value="Fase1">Fase1</form:option>
								<form:option value="Fase2">Fase2</form:option>
								<form:option value="Fase3">Fase3</form:option>
							</form:select>
						</div>
						<div class="row form-group ">
							<label for="startDate">Start:</label>
							<div class="input-group" id="startDate">
								<form:input class="form-control" path="startDate" id="startDate" />
								<span class="input-group-addon">
                    					<span class="fa fa-calendar"></span>
               					 </span>
							</div>
						</div>
						<div class="row form-group">
							<label for="comment">Task:</label>
							<form:textarea  class="form-control" path="comment" id="comment" />
						</div>
						<div class="row text-center"> 
							<button class="btn btn-success" type="submit">Add</button>
						</div>
					</form:form>
				</div>
			</div>
		</div>
		<div class="col-md-4"></div>
	</div>	
</body>
</html>
