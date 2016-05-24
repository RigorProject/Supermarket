<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
		<!-- Latest compiled and minified CSS -->
		<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">

		<!-- jQuery library -->
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>

		<!-- Latest compiled JavaScript -->
		<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

	</head>
	<body>
		<nav class="navbar navbar-inverse">
		  <div class="container-fluid">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
			  <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
				<span class="sr-only">Toggle navigation</span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			  </button>
			  <a class="navbar-brand" href="home.html">MANA</a>
			</div>

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
			  <ul class="nav navbar-nav">
				<li class="dropdown">
				  <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Product <span class="caret"></span></a>
				  <ul class="dropdown-menu">
					<li> <a href="<c:url value='product.htm'/>">Add Product</a></li>
					<li> <a href="<c:url value='addProduct.htm'/>">Product Search</a></li>
				  </ul>
				</li>
				<li class="dropdown">
				  <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Invoice <span class="caret"></span></a>
				  <ul class="dropdown-menu">
				  
					<li><a href="<c:url value='addInvoice.htm'/>">Add Invoice</a></li>
					<li><a href="List Invoice.html">Invoice Search</a></li>
				  </ul>
				</li>
				<li><a href="Place GRN.html">Place GRN</a></li>
				<li><a href="<c:url value='listSupplier.htm'/>">List Suppliers</a></li>
				<li><a href="view journal.html">View Journal</a></li>
			  </ul>
			</div><!-- /.navbar-collapse -->
		  </div><!-- /.container-fluid -->
		</nav>
		
			
		<script src="http://code.jquery.com/jquery-latest.js"></script><script language="javascript">'use strict';$(function() {var width = 720; var animationSpeed = 1250; var pause = 3500; var currentSlide = 1;var $slider = $('#slider'); var $slideContainer = $('.slides', $slider); var $slides = $('.slide', $slider); var interval; function startSlider() { interval = setInterval(function() { $slideContainer.animate({'margin-left': '-='+width}, animationSpeed, function() {if (++currentSlide === $slides.length) {currentSlide = 1; $slideContainer.css('margin-left', 0); }});}, pause);} function pauseSlider() {clearInterval(interval);}$slideContainer.on('mouseenter', pauseSlider).on('mouseleave', startSlider);startSlider();});</script><div style="width: 720px; margin: 0 auto;">
		<div style="position: relative; width: 720px; "><div style="position: absolute; right:0px; top:3px; padding: 3px 7px 3px; z-index:99; background-color: #000000; opacity:0.5; border-radius:7px;"><A style="color: #fff; text-decoration:none; font-size:7pt; line-height:10px; font-family: arial;" HREF="&#104;&#116;&#116;&#112;&#58;&#47;&#47;&#119;&#119;&#119;&#46;&#49;&#50;&#51;&#45;&#115;&#108;&#105;&#100;&#101;&#115;&#104;&#111;&#119;&#46;&#99;&#111;&#109;" TARGET="_blank">&#70;&#114;&#101;&#101;&#32;&#83;&#108;&#105;&#100;&#101;&#115;&#104;&#111;&#119;&#32;&#77;&#97;&#107;&#101;&#114;</A></div><style type="text/css">#slider {width: 720px; height: 400px; border: 3px solid #FFFFFF; border-radius: 0px; overflow: hidden; position: relative;  cursor: hand; cursor: pointer}#slider .slides {width: 2880px; height: 400px;  display: block; margin: 0; padding: 0;}#slider .slide {width: 720px; height: 400px; float: left; list-style-type: none;}.DIT160510 {position: absolute; max-width: 720px; margin: 0px;}.c12994  {position: absolute; bottom: 0px; width:100%;  padding: 12px; background-color: rgba(0, 0, 0, 0.7); color: #FFFFF; font-size:24pt; font-family:Tahoma; text-align:center; line-height:48px; z-index:33; -webkit-box-sizing: border-box; -moz-box-sizing: border-box; box-sizing: border-box;}</style><div id="slider"><ul class="slides">

			<li class="slide slide1">
			 <figure class="DIT160510">
			   
			  <img alt="image"  src="<c:url value="/static/img/a.jpg" />">
			 </figure>
			 </li>

			<li class="slide slide2">
			 <figure class="DIT160510">
			 <img alt="image"  src="<c:url value="/static/img/b.jpg"/>">
			 
			 </figure>
			 </li>

			<li class="slide slide3">
			 <figure class="DIT160510">
			  <img alt="image"  src="<c:url value="/static/img/c.jpg"/>">
			  <!-- IMG SRC="img/12994-3.jpg">  -->
			 </figure>
			 </li>

			<li class="slide slide1">
			 <figure class="DIT160510">
			 <img alt="image"  src="<c:url value="/static/img/a.jpg"/>">
			 
			 </figure>
			 </li>

		</ul></div></div></div>
	<!--My Adding  -->
	
	
</body>
</html>
