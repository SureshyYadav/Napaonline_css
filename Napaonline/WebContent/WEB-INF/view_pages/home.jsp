<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="resources/css/header1.css"/>
<link rel="stylesheet" href="resources/css/body.css"/>
<link rel="stylesheet" href="resources/css/header2.css"/>
<link rel="stylesheet" href="resources/css/header3.css"/>
<link rel="stylesheet" href="resources/css/slider.css"/>
<link rel="stylesheet" href="resources/css/search.css"/>
<link rel="stylesheet" href="resources/css/header4.css"/>
<link rel="stylesheet" href="resources/css/header7.css"/>
</head>
<body>
<div id="login">
<ul>
<li><a href="trackOrder">Track Order</a></li>
<li><a href="login">Login</a></li>
<li><a href="register">Register</a></li>
<li><a href="store">Store Item details</a></li>
<li><a href="break">Breaks details</a></li>
</ul>
</div>
<div id="header2">
<!-- <ul>
 <li><img src="resources/images/images.png" class="abc"></li> 
<li><p>change vehicle</p></li>
<li><p>change store</p></li>
<li><img src="resources/images/cart.png" class="cart_image"> </li>
<li><input type="text" placeholder="Search.."></li>
</ul> -->
</div>
<div class="topnav">
  <a class="active" href="#home">PARTS, TOOLS & ACCESSORIES</a>
  <a href="#about">POPULAR BRANDS</a>
  <a href="#contact">KNOW HOW</a>
  <a href="#contact">DEALS</a>
  <div class="search-container">
    <form action="/action_page.php">
      <input type="text" placeholder="Search.." name="search">
      <button type="submit"><i class="fa fa-search"></i></button>
    </form>
  </div>
</div>

<div class="slideshow-container">
<div class="mySlides fade">
  <div class="numbertext">1 / 4</div>
  <img src="resources/images/july2018-IFHF-PROMO-D-EN.jpg" style="width:100%">
  <!-- <div class="text">Caption Text</div> -->
</div>

<div class="mySlides fade">
  <div class="numbertext">2 / 4</div>
  <img src="resources/images/PROMO-20-OFF-D.jpg" style="width:100%">
  <!-- <div class="text">Caption Two</div> -->
</div>

<div class="mySlides fade">
  <div class="numbertext">3 / 4</div>
  <img src="resources/images/REWARDS-D.jpg" style="width:100%">
  <!-- <div class="text">Caption Three</div> -->
</div>

<div class="mySlides fade">
  <div class="numbertext">4 / 4</div>
  <img src="resources/images/VEGAS-D.jpg" style="width:100%">
  <!-- <div class="text">Caption four</div> -->
</div>
<br>
<div style="text-align:center">
  <span class="dot"></span> 
  <span class="dot"></span> 
  <span class="dot"></span> 
  <span class="dot"></span> 
</div>
</div>
<div id="header5">
White
</div>

<div class="custom-select">
<p> I NEED TO FIND</p>
 <form action="/action_page.php">
<input type="text"placeholder="Enter a vehicle specific part" name="search">
<select>
    <option value="0">Year:</option>
    <option value="1">2019</option>
    <option value="2">2018</option>
    <option value="3">2017</option>
    <option value="4">2016</option>
    <option value="5">2015</option>
    <option value="6">2014</option>
    <option value="7">2013</option>
    <option value="8">2012</option>
    <option value="9">2011</option>
    <option value="10">2010</option>
    <option value="11">2009</option>
    <option value="12">2008</option>
  </select>
  
  <select>
    <option value="0">Select car:</option>
    <option value="1">Audi</option>
    <option value="2">BMW</option>
    <option value="3">Citroen</option>
    <option value="4">Ford</option>
    <option value="5">Honda</option>
    <option value="6">Jaguar</option>
    <option value="7">Land Rover</option>
    <option value="8">Mercedes</option>
    <option value="9">Mini</option>
    <option value="10">Nissan</option>
    <option value="11">Toyota</option>
    <option value="12">Volvo</option>
  </select>
  <button type="submit">Find</button>
  </form>
</div>
<div id="header6">
White
</div>
<div id="header7">
<ul>
  <li><img src="resources/images/DriveAlive.jpg"></li>
  
  <li><img src="resources/images/KeepCool.jpg"></li>
 
  <li><img src="resources/images/LookingNew.jpg"></li>
  </ul>

</div>
<script>
var slideIndex = 0;
showSlides();

function showSlides() {
    var i;
    var slides = document.getElementsByClassName("mySlides");
    var dots = document.getElementsByClassName("dot");
    for (i = 0; i < slides.length; i++) {
       slides[i].style.display = "none";  
    }
    slideIndex++;
    if (slideIndex > slides.length) {slideIndex = 1}    
    for (i = 0; i < dots.length; i++) {
        dots[i].className = dots[i].className.replace(" active", "");
    }
    slides[slideIndex-1].style.display = "block";  
    dots[slideIndex-1].className += " active";
    setTimeout(showSlides, 2000); // Change image every 2 seconds
}
</script>

</body>
</html>
