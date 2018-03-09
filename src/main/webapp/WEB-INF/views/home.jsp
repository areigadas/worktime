<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
 <%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
  <link rel="stylesheet" href="webjars/bootstrap/3.3.6/css/bootstrap.css">
  <link rel="stylesheet" href="webjars/bootstrap/3.3.6/css/bootstrap-theme.css">
  <link rel="stylesheet" href="<c:url value='/resources/cs/login.css' />">
  <script type="text/javascript" src="webjars/jquery/2.2.4/jquery.min.js"></script>
  <script type="text/javascript" src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<meta charset="UTF-8">
<title>Timesheet System</title>

</head>
<body>

<div class="container">

	<!-- Head  -->
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
	    	<div class="navbar-header">
	      		<div class="navbar-brand"></div>
	    	</div>
			<ul class="nav navbar-nav navbar-right">
			  <li class="dropdown" id="welcome">
				  <a href="#" data-toggle="modal" data-target="#login-modal">
					<span class="glyphicon glyphicon-user"></span> Sign Up
				  </a>
			  </li>
			</ul>		    	
	  	</div>
	</nav>
	<!-- End of Head  -->
	
	<!--     MODAL LOGIN     -->
	<div class="modal fade" id="login-modal" role="dialog" style="display: none;">
		<div class="modal-dialog">
			<div class="loginmodal-container">
				<h1>Login to Your Account</h1><br>
				<form:form action="${s:mvcUrl('LC#login').build()}" method="POST" modelAttribute="Usuario" id="loginform">
					<input type="text" name="email" placeholder="Email" id="email" autofocus>
					<input type="password" name="passw" placeholder="Password" id="passw">
					<button type="submit" class="btn btn-info ">Sign in</button>
	        		</form:form>	
	      	</div>
	    </div>
  	</div>
	<!--- end modal login -->

	
	<h1 class="text-center">Timesheet - Main menu</h1>
	<div class="container">
		<div class="col-md-4"></div>
		<div class="col-md-4">
			<div class="panel panel-info">
				<div class="panel-heading">
					<div class=" text-center"><form action="<c:url value='/form'/>" method="GET">    
						<button class="btn btn-success btn-lg btn-block" type="submit" id="start">START</button></form>
					</div>
					<div class=" text-center"><form action="<c:url value='/openedTasks'/>" method="POST">   
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
</div>
<script type="text/javascript" src="<c:url value='/resources/js/login.js' />"></script>
</body>
</html>