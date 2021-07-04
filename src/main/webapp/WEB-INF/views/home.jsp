<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE HTML>
<html lang="en" xmlns:th="http://thymeleaf.org/">
<head>
<title>ZLINE Travels :: Home </title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<link href="${contextPath}/css/bootstrap.css" rel='stylesheet' type='text/css' />
<link href="${contextPath}/css/style.css" rel='stylesheet' type='text/css' />
<!-- Custom Theme files -->
<script src="${contextPath}/js/jquery-1.12.0.min.js"></script>

</head>
<body>
<!-- top-header -->
<div class="top-header">
	<div class="container">
		<ul class="tp-hd-lft">
				
		</ul>
		<ul class="tp-hd-rgt"> 
			<li class="tol">Toll Number : 7684971077</li>				
			<li class="sig"><a href="/register">Sign Up</a></li> 
			<li class="sigi"><a href="/signin">/ Sign In</a></li>
        </ul>
		<div class="clearfix"></div>
	</div>
</div>
<!--- /top-header ---->

<!--- header ---->
<div class="header">
	<div class="container">
		<div class="logo">
			<a href="/">ZLINE <span>TRAVELS</span></a>	
		</div>
		<div class="lock"> 
            <li><div class="securetxt">SAFE &amp; SECURE<br> Bus Travel</div></li>
			<div class="clearfix"></div>
		</div>
		<div class="clearfix"></div>
	</div>
</div>
<!--- /header ---->

<!--- banner ---->
<div class="banner">
	<form action="/user/chooseLogin" method="POST">
	<div class="container" style="height:0px;position:relative; top:60px;">
		<h1 style="color:#1a6100; ">ZLINE Bus Service.<br>(Luxury Volvo Bus)</h1>
		<input type="hidden" name="loginInfo" id="loginInfo" >
		<button class="btn" type="submit" name="reservation" value="reservation" id="reservation" Style="position:relative; left:0%; top:180px; background-color: #34a30b; color: white; padding: 15px 32px;font-size: 16px;" onclick="myFun()">BOOK TICKETS NOW</button>
		<input type="hidden" id="isLogged" >
		<button class="btn" type="submit"  name="manage" value="manage" id="manage" Style="position:relative; left:60%; background-color: #34a30b; color: white; padding: 15px 32px;top:180px;font-size: 16px;" onclick="myFun1()">VIEW ALL BOOKING</button>
		<br>
	</div>
	</form>
</div>

<div class="container">
	<div class="holiday">
		<div class="col-md-3">
			<img src="images/4.jpg" class="img-responsive" alt="">
		</div>
		<div class="col-md-6">
			<h3>Travel Holiday Packages</h3>
		<p>Private Guide and Driver in any language and in any departure date. For more information please contact us....</p>
		</div>
		<div class="col-md-3">
			<img src="images/5.jpg" class="img-responsive" alt="">
		</div>
			<div class="clearfix"></div>
	</div>
</div>


<!--- /footer-top ---->
<!---copy-right ---->
<div class="copy-right">
	<div class="container">
		<p>© 2021 ZLINE TRAVELS . All Rights Reserved | Design by  <a href="https://www.linkedin.com/in/adarsh57/" target="_blank">Adarsh Biswal</a> </p>
	</div>
</div>
</body>
<script type="text/javascript">
	function myFun()
	{
		document.getElementById("loginInfo").value="reservation";
		
	}
	function myFun1()
	{
		document.getElementById("loginInfo").value="manage";
		
	}
</script>
</html>
</html>