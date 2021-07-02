<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <%@ page isELIgnored="false" %>
    
	<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<title>ZLINE :: Reservation</title>
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
	<div class="main">
		<h2>Book Your Ticket</h2>
		<div class="clear"></div>
			<form action="/bus/selectSeat" method="post">
  				<div class="form-row">
    				<div class="form-group col-md-6">
      					<label style="position:relative; left:40%;  font-weight: bold;" for="fromCity">From</label>
      					<input style="text-align: center; " type="text" class="form-control" id="fromCity1" name="fromCity1"  placeholder="From City" value="${startCity}" disabled>
    				</div>
    				<div class="form-group col-md-6">
      					<label for="toCity" style="position:relative; left:40%; font-weight: bold;">To</label>
     					<input style="text-align: center;" type="text" class="form-control" id="toCity1" name="toCity1" placeholder="To City" value="${destCity}" disabled>
    				</div>
  				</div>
    
    			<h4 Style="position:relative; left:17%;"><br>Select Your Desired Bus<br><br></h4>
    				<div class="form-group col-md-10">
   						<input type="hidden" name="email" value="${email}">
   						<input type="hidden" name="JDate" value="${JDate}">
   						<input type="hidden" name="fromCity" value="${startCity}">
   						<input type="hidden" name="toCity" value="${destCity}">
   	
   						<table class="table text-center" style="width: 120%; postion:relative;">
   						<thead class="thead-dark">
    						<tr>
    						
      							<th scope="col">Date of Journey</th>
      							
      							<th scope="col">Name of Bus</th>
    						</tr>
  						</thead>
   						
   						
    
    					<c:forEach var="emp" items="${busList}">
    						<tr style="border-bottom: 1px solid #000;">
    						<th scope="row" style="width:40%">${JDate}</th>
    						<th> <input type="submit" class="list-group-item list-group-item-action list-group-item-success" style="border: none; font-size:12px; width:80%;display: block; line-height: 2px; height:25px;left:15%;" name="busName" value="${emp}" align="center"></th>
    						</tr>
    					</c:forEach>
    					</table>
    
  					</div>	
		</form>
	</div>
	<p class="copy_rights">&copy; 2021 ZLINE TRAVELS . All Rights Reserved | Design by  <a href="hhttps://www.linkedin.com/in/adarsh57/" target="_blank"> Adarsh Biswal</a></p>
</div>

<script src="${contextPath}/js/jquery.nicescroll.js"></script>
<script src="${contextPath}/js/scripts.js"></script>

</body>
</html>