<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="../../favicon.ico">

<title>log-in page</title>

<!-- Bootstrap core CSS -->
<link
	href="${pageContext.request.contextPath }/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<link href="${pageContext.request.contextPath }/css/signin.css" rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

</head>

<body>

	<div class="container">

		<form id="frm" class="form-signin" action="${pageContext.request.contextPath }/login" method="post">

			<h2 class="form-signin-heading">Please sign in</h2>

			<label for="userId" class="sr-only">USER ID</label> 
			<input type="text" id="userId" name="userId" class="form-control" placeholder="ID" value="sally"> 
			<label for="pass" class="sr-only">Password</label> 
			<input type="password" id="pass" name="pass" class="form-control" placeholder="Password" value="sally1234">


			<button id="signinBtn"class="btn btn-lg btn-primary btn-block" type="submit">Sign
				in</button>

		</form>

	</div>
	<!-- /container -->



</body>
</html>