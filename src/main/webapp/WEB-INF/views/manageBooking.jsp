<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ page isELIgnored="false" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<title>ZLINE :: VIEW BOOKING</title>
<link href="${contextPath}/css1/style.css" rel="stylesheet" type="text/css" media="all" />
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<style>
form {border: 3px solid #f1f1f1;}

input[type=text], input[type=password] {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}

button {
  background-color: #04AA6D;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
}

button:hover {
  opacity: 0.8;
}

.cancelbtn {
  width: auto;
  padding: 10px 18px;
  background-color: #f44336;
}

.imgcontainer {
  text-align: center;
  margin: 24px 0 12px 0;
}

img.avatar {
  width: 40%;
  border-radius: 50%;
}

.container {
  padding: 16px;
}

span.psw {
  float: right;
  padding-top: 16px;
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
  span.psw {
     display: block;
     float: none;
  }
  .cancelbtn {
     width: 100%;
  }
}
</style>
</head>
<body>
<nav class="navbar navbar-expand-lg  bg-light">
  <a class="navbar-brand" href="#" style="color:GREEN;">ZLINE TRAVELS</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNavDropdown">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="/">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/register" style="position:relative; left:980%;">REGISTER</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/signin" style="position:relative; left:1170%;" >LOGIN</a>
      </li>
    </ul>
  </div>
</nav>
<div class="content">
	<h1>Welcome to ZLine Bus Reservation</h1>
	
	
	
	<div class="main" style="width:50%;">
		<div class="clear"></div>
		<table class="table">
  				<thead >
    			<tr>
      				<th scope="col" style=" text-align:center;color:red;">VIEW YOUR BOOKINGS</th>
    			</tr>
  				</thead>
  		</table>
  		<c:forEach var="emp" items="${model}">
  			<table class="table">
  			<thead class="thead-dark">
    		<tr style="border-bottom: 1px solid #000;">
    			<th scope="col" style=" text-align: center;">DATE<br>   ${emp.date}</th>
      			<th scope="col" style=" text-align: center;">FROM<br>   ${emp.from}</th>
      			<th scope="col" style=" text-align: center;">TO<br>     ${emp.to}</th>
      			<th scope="col" style=" text-align: center;">BUS NAME <br> ${emp.busID}</th>
      			<th scope="col" style=" text-align: center;">SEAT <br>	  ${emp.seats}</th>
    		</tr>	
  			</thead>
  		</table>
    	</c:forEach>
  		
  		
  		
  		<table class="table">
  			<thead>
    		<tr>
      			<th scope="col" style="text-align: center;"><input type="submit" class="list-group-item list-group-item-action list-group-item-success" value="PRINT TICKET" onclick="window.print()"></th>
      			<th scope="col" style="text-align: center;"><input type="submit" class="list-group-item list-group-item-action list-group-item-success" value="Exit" onclick="myFunction()"></th>
    		</tr>
  			</thead>
  		</table>
  		
  			
  		



	</div>
	<p class="copy_rights">&copy; 2021 ZLINE TRAVELS . All Rights Reserved | Design by  <a href="hhttps://www.linkedin.com/in/adarsh57/" target="_blank"> Adarsh Biswal</a></p>
</div>
<script src="js/jquery.nicescroll.js"></script>
<script src="js/scripts.js"></script>
<script type="text/javascript">
function myFunction() {
	  var r = confirm("You are about to return to Home Page");
	  if(r==true)
		{
			window.location.href ="/";
		}
	}
myFun



</script>
</body>
</html>