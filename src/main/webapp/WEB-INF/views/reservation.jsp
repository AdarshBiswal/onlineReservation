<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ page isELIgnored="false" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html lang="en" xmlns:th="http://thymeleaf.org/">
<head>
<title>ZSphere-Reservation</title>
<link href="${contextPath}/css1/style.css" rel="stylesheet" type="text/css" media="all" />
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
<body onload="myFunction1()">
<div class="content">
	<h1>Welcome to ZLine Bus Reservation</h1>
	<div class="main" >
	
		<h2>Select the seat</h2>
		<form action="/booking/payment" method="post" onsubmit="myFunction2()">
		
			<ol>
			
    		<li class="row row--1">
      			<ol class="seats" type="A">
        			<li class="seat" style="postion:relative; left:10%;">
          				<input type="checkbox" name="seat1" id="seat1" value="1"/>
          				<label for="seat1" id="label1" name="label1" >1</label>
        			</li>
        			<li class="seat" style="postion:relative; left:10%;">
          				<input type="checkbox" name="seat2" id="seat2" value="1"/>
          				<label for="seat2" id="label2" name="label2">2</label>
        			</li>
        			
        			<li class="seat" style="postion:relative; left:30%;">
          				<input type="checkbox" name="seat3" id="seat3" value="1" />
          				<label for="seat3" id="label3">3</label>
        			</li>
        			
        			<li class="seat" style="postion:relative; left:15%;">
         				<input type="checkbox" name="seat4" id="seat4" value="1" />
          				<label for="seat4" id="label4">4</label>	
        			</li>
      			</ol>
    		</li>
    		<li class="row row--1">
      			<ol class="seats" type="A">
        			<li class="seat" style="postion:relative; left:10%;">
          				<input type="checkbox" name="seat5" id="seat5" value="1"/>
          				<label for="seat5" id="label5"> 5</label>
        			</li>
        			<li class="seat" style="postion:relative; left:10%;">
          				<input type="checkbox" name="seat6" id="seat6" value="1"/>
          				<label for="seat6" id="label6">6</label>
        			</li>
        			
        			<li class="seat" style="postion:relative; left:30%;">
          				<input type="checkbox" name="seat7" id="seat7" value="1"/>
          				<label for="seat7" id="label7">7</label>
        			</li>
        			
        			<li class="seat" style="postion:relative; left:15%;">
         				<input type="checkbox" name="seat9" id="seat8" value="1"/>
          				<label for="seat8" id="label8">8</label>	
        			</li>
      			</ol>
    		</li>
    		<li class="row row--1">
      			<ol class="seats" type="A">
        			<li class="seat" style="postion:relative; left:10%;">
          				<input type="checkbox" name="seat9" id="seat9" value="1"/>
          				<label for="seat9" id="">9</label>
        			</li>
        			<li class="seat" style="postion:relative; left:10%;">
          				<input type="checkbox" name="seat10" id="seat10" value="1"/>
          				<label for="seat10" id="label10">10</label>
        			</li>
        			
        			<li class="seat" style="postion:relative; left:30%;">
          				<input type="checkbox" name="seat11" id="seat11" value="1"/>
          				<label for="seat11">11</label>
        			</li>
        			
        			<li class="seat" style="postion:relative; left:15%;">
         				<input type="checkbox" name="seat12" id="seat12" value="1"/>
          				<label for="seat12" id="label12">12</label>	
        			</li>
      			</ol>
    		</li>
    		<li class="row row--1">
      			<ol class="seats" type="A">
        			<li class="seat" style="postion:relative; left:10%;">
          				<input type="checkbox" name="seat13" id="seat13" value="1"/>
          				<label for="seat13" id="label13">13</label>
        			</li>
        			<li class="seat" style="postion:relative; left:10%;">
          				<input type="checkbox" name="seat14" id="seat14" value="1"/>
          				<label for="seat14" id="label14">14</label>
        			</li>
        			
        			<li class="seat" style="postion:relative; left:30%;">
          				<input type="checkbox" name="seat15" id="seat15" value="1"/>
          				<label for="seat15" id="label15">15</label>
        			</li>
        			
        			<li class="seat" style="postion:relative; left:15%;">
         				<input type="checkbox" name="seat16" id="seat16" value="1"/>
          				<label for="seat16" id="label16">16</label>	
        			</li>
      			</ol>
    		</li>
    		<li class="row row--1">
      			<ol class="seats" type="A">
        			<li class="seat" style="postion:relative; left:10%;">
          				<input type="checkbox" name="seat17" id="seat17" value="1"/>
          				<label for="seat17" id="label17">17</label>
        			</li>
        			<li class="seat" style="postion:relative; left:10%;">
          				<input type="checkbox" name="seat18" id="seat18" value="1"/>
          				<label for="seat18" id="label18">18</label>
        			</li>
        			
        			<li class="seat" style="postion:relative; left:30%;">
          				<input type="checkbox" name="seat19" id="seat19" value="1"/>
          				<label for="seat19" id="label19">19</label>
        			</li>
        			
        			<li class="seat" style="postion:relative; left:15%;">
         				<input type="checkbox" name="seat20" id="seat20" value="1"/>
          				<label for="seat20" id="label20">20</label>	
        			</li>
      			</ol>
    		</li>
    		<li class="row row--7">
      			<ol class="seats" type="A">
        			<li class="seat" style="postion:relative; left:10%;">
          				<input type="checkbox" name="seat21" id="seat21" value="1"/>
          				<label for="seat21" id="label21">21</label>
        			</li>
        			<li class="seat" style="postion:relative; left:10%;">
          				<input type="checkbox" name="seat22" id="seat22" value="1"/>
          				<label for="seat22" id="label22">22</label>
        			</li>
        			
        			<li class="seat" style="postion:relative; left:30%;">
          				<input type="checkbox" name="seat23" id="seat23" value="1"/>
          				<label for="seat23" id="label23">23</label>
        			</li>
        			
        			<li class="seat" style="postion:relative; left:15%;">
         				<input type="checkbox" name="seat24" id="seat24" value="1"/>
          				<label for="seat24" id="label24">24</label>	
        			</li>
      			</ol>
    		</li>
    		<li class="row row--8">
      			<ol class="seats" type="A">
        			<li class="seat" style="postion:relative; left:10%;">
          				<input type="checkbox" name="seat25" id="seat25" value="1"/>
          				<label for="seat25" id="label25">25</label>
        			</li>
        			<li class="seat" style="postion:relative; left:10%;">
          				<input type="checkbox" name="seat26" id="seat26" value="1"/>
          				<label for="seat26" id="label26">26</label>
        			</li>
        			
        			<li class="seat" style="postion:relative; left:30%;">
          				<input type="checkbox" name="seat27" id="seat27" value="1"/>
          				<label for="seat27" id="label27">27</label>
        			</li>
        			
        			<li class="seat" style="postion:relative; left:15%;">
         				<input type="checkbox" name="seat28" id="seat28" value="1"/>
          				<label for="seat28" id="label28">28</label>	
        			</li>
      			</ol>
    		</li>
    		<li class="row row--9">
      			<ol class="seats" type="A">
        			<li class="seat" style="postion:relative; left:10%;">
          				<input type="checkbox" name="seat29" id="seat29" value="1"/>
          				<label for="seat29" id="label29">29</label>
        			</li>
        			<li class="seat" style="postion:relative; left:10%;">
          				<input type="checkbox" name="seat30" id="seat30" value="1"/>
          				<label for="seat30" id="label30">30</label>
        			</li>
        			
        			<li class="seat" style="postion:relative; left:30%;">
          				<input type="checkbox" name="seat31" id="seat31" value="1"/>
          				<label for="seat31" id="label31">31</label>
        			</li>
        			
        			<li class="seat" style="postion:relative; left:15%;">
         				<input type="checkbox" name="seat32" id="seat32" value="1"/>
          				<label for="seat32" id="label32">32</label>	
        			</li>
      			</ol>
    		</li><li class="row row--10">
      			<ol class="seats" type="A">
        			<li class="seat" style="postion:relative; left:10%;">
          				<input type="checkbox" name="seat33" id="seat33" value="1"/>
          				<label for="seat34" id="label33">33</label>
        			</li>
        			<li class="seat" style="postion:relative; left:10%;">
          				<input type="checkbox" name="seat34" id="seat34" value="1"/>
          				<label for="seat34" id="label34">34</label>
        			</li>
        			
        			<li class="seat" style="postion:relative; left:30%;">
          				<input type="checkbox" name="seat35" id="seat35" value="1"/>
          				<label for="seat35" id="label35">35</label>
        			</li>
        			
        			<li class="seat" style="postion:relative; left:15%;">
         				<input type="checkbox" name="seat36" id="seat36" value="1"/>
          				<label for="seat36" id="label36">36</label>	
        			</li>
      			</ol>
    		</li>
		</ol>
			<input type="hidden"   name="email" id="email" value="${email}">
			<input type="hidden"   name="JDate" id="JDate" value="${JDate}">
			<input type="hidden"   name="busName" id="busName" value="${busName}">
			<input type="hidden"    name="fromCity" id="fromCity" value="${fromCity}">
			<input type="hidden"   name="toCity"  id="toCity" value="${toCity}">
			
			<button type="submit">Pay and Book now</button>
			<br>
			<br>
		</form>
		
	</div>
		<p class="copy_rights">&copy; 2021 ZLINE TRAVELS . All Rights Reserved | Design by  <a href="hhttps://www.linkedin.com/in/adarsh57/" target="_blank"> Adarsh Biswal</a></p>
	</div>

<script type="text/javascript">
	function myFunction1() {
		
		
		if("${s1}"=="Y")
			{
				document.getElementById("seat1").disabled=true;
			}
		if("${s2}"=="Y")
		{
			document.getElementById("seat2").disabled=true;
		
		}
		if("${s3}"=="Y")
		{
			document.getElementById("seat3").disabled=true;
		
		}
		if("${s4}"=="Y")
		{
			document.getElementById("seat4").disabled=true;
		
		}
		if("${s5}"=="Y")
		{
			document.getElementById("seat5").disabled=true;
		
		}
		if("${s6}"=="Y")
		{
			document.getElementById("seat6").disabled=true;
		
		}
		if("${s7}"=="Y")
		{
			document.getElementById("seat7").disabled=true;
		
		}
		if("${s8}"=="Y")
		{
			document.getElementById("seat8").disabled=true;
		
		}
		if("${s9}"=="Y")
		{
			document.getElementById("seat9").disabled=true;
		
		}
		if("${s10}"=="Y")
		{
			document.getElementById("seat10").disabled=true;
		
		}
		if("${s11}"=="Y")
		{
			document.getElementById("seat11").disabled=true;
		
		}
		if("${s12}"=="Y")
		{
			document.getElementById("seat12").disabled=true;
		
		}
		if("${s13}"=="Y")
		{
			document.getElementById("seat13").disabled=true;
		
		}
		if("${s14}"=="Y")
		{
			document.getElementById("seat14").disabled=true;
		
		}
		if("${s15}"=="Y")
		{
			document.getElementById("seat15").disabled=true;
		
		}
		if("${s16}"=="Y")
		{
			document.getElementById("seat16").disabled=true;
		
		}
		if("${s17}"=="Y")
		{
			document.getElementById("seat17").disabled=true;
		
		}
		if("${s18}"=="Y")
		{
			document.getElementById("seat18").disabled=true;
		
		}
		if("${s19}"=="Y")
		{
			document.getElementById("seat19").disabled=true;
		
		}
		if("${s20}"=="Y")
		{
			document.getElementById("seat20").disabled=true;
		
		}
		if("${s21}"=="Y")
		{
			document.getElementById("seat21").disabled=true;
		
		}
		if("${s22}"=="Y")
		{
			document.getElementById("seat22").disabled=true;
		
		}
		if("${s23}"=="Y")
		{
			document.getElementById("seat23").disabled=true;
		
		}
		if("${s24}"=="Y")
		{
			document.getElementById("seat24").disabled=true;
		
		}
		if("${s25}"=="Y")
		{
			document.getElementById("seat25").disabled=true;
		
		}
		if("${s26}"=="Y")
		{
			document.getElementById("seat26").disabled=true;
		
		}
		if("${s27}"=="Y")
		{
			document.getElementById("seat27").disabled=true;
		
		}
		if("${s28}"=="Y")
		{
			document.getElementById("seat28").disabled=true;
		
		}
		if("${s29}"=="Y")
		{
			document.getElementById("seat29").disabled=true;
		
		}
		if("${s30}"=="Y")
		{
			document.getElementById("seat30").disabled=true;
		
		}
		if("${s31}"=="Y")
		{
			document.getElementById("seat31").disabled=true;
		
		}
		if("${32}"=="Y")
		{
			document.getElementById("seat32").disabled=true;
		
		}
		if("${s33}"=="Y")
		{
			document.getElementById("seat33").disabled=true;
		
		}
		if("${s34}"=="Y")
		{
			document.getElementById("seat34").disabled=true;
		
		}
		if("${s35}"=="Y")
		{
			document.getElementById("seat35").disabled=true;
		
		}
		if("${s36}"=="Y")
		{
			document.getElementById("seat36").disabled=true;
		
		}
		
		
	
	}
			
		
	
	

</script>
</body>
</html>