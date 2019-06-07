<%@page import="kr.or.ddit.user.model.UserVO"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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

<title>Shookie's Main</title>

<!-- css / js -->
<%@include file="/common/basicLib.jsp" %>

</head>

<body>
	<!-- header -->
   	<%@include file="/common/header.jsp" %>
   
   
<div class="container-fluid">
      <div class="row">
         
	<!-- left -->
	<%@include file="common/left.jsp" %>

<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
            

<div class="blog-header">
   <h1 class="blog-title">Main</h1>
   <p class="lead blog-description">Main</p>
</div>


      </div>
   </div>
</div>
</body>
</html>