<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html lang="en" xmlns:th="http://thymeleaf.org/">
<head>
<title>ZLINE :: Admin Page</title>
<link href="${contextPath}/css1/style.css" rel="stylesheet" type="text/css" media="all" />
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<style>
form {border: 3px solid #f1f1f1;}

input[type=text], input[type=password] ,input[type=email] {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
  text-allign:center;
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
		<h2>You Can now add Bus</h2>
		<div class="clear"></div>
		<button onclick="myFun3()">Click Here To Add Bus</button>
		
		<div id="divDISPLAY" style="display:none">
			<form action="/bus/addBus" method="post" >

 					<label for="busName"><b>Bus Name</b></label>
    				<input type="text" placeholder="Enter Bus Name" name="busName" required>
    				<label for="startCity"><b>From</b></label>
    				<input type="text" placeholder="Enter LastName" name="startCity" required>
    				<label for="destinationCity"><b>To</b></label>
    				<input type="text" placeholder="Enter Email Address" name="destinationCity" required >
    				
    				<label for="bookedSeat"><b>Booked seats</b></label>
    				<input type="text" placeholder="Enter which seats are booked in space. EX:1 2" name="bookedSeat" required >
    				
    				<label for="startingTime"><b>Bus Time</b></label>
    				<input type="text" placeholder="Enter Bus Time Ex. 10:00 PM" name="startingTime" required >
    				
    				<label for="day"><b>Enter Day</b></label>
    				<input type="text" placeholder="Enter Day. Ex: Monday" name="day" required >
    				
  
    				<button type="submit">Add Bus</button>
  				</div>
		</form>
		</div>
		
		
	</div>
		<p class="copy_rights">&copy; 2021 ZSphere Reservation System . All Rights Reserved | Design by  <a href="hhttps://www.linkedin.com/in/adarsh57/" target="_blank"> Adarsh Biswal</a></p>
	</div>
<script >
function isNumber(evt) {
    evt = (evt) ? evt : window.event;
    var charCode = (evt.which) ? evt.which : evt.keyCode;
    if (charCode > 31 && (charCode < 48 || charCode > 57)) {
        return false;
    }
    return true;
}


function validateEmail(emailField){
    var reg = /^([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,4})$/;

    if (reg.test(emailField.value) == false) 
    {
        alert('Invalid Email Address');
        return false;
    }

    return true;

}

function myFun3(){
	
	var x=document.getElementById("divDISPLAY");
   	if(x.style.display === "none")
   		{
   			x.style.display="block";
   		}
   	else
   		{
   			x.style.display ="none";
   		}
}

</script>
	


</body>
</html>