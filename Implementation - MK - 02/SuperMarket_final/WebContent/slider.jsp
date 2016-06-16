<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<script src="http://code.jquery.com/jquery-latest.js"></script><script language="javascript">'use strict';$(function() {var width = 720; var animationSpeed = 1250; var pause = 3500; var currentSlide = 1;var $slider = $('#slider'); var $slideContainer = $('.slides', $slider); var $slides = $('.slide', $slider); var interval; function startSlider() { interval = setInterval(function() { $slideContainer.animate({'margin-left': '-='+width}, animationSpeed, function() {if (++currentSlide === $slides.length) {currentSlide = 1; $slideContainer.css('margin-left', 0); }});}, pause);} function pauseSlider() {clearInterval(interval);}$slideContainer.on('mouseenter', pauseSlider).on('mouseleave', startSlider);startSlider();});</script><div style="width: 720px; margin: 0 auto;">
		<div style="position: relative; width: 720px; "><div style="position: absolute; right:0px; top:3px; padding: 3px 7px 3px; z-index:99; background-color: #000000; opacity:0.5; border-radius:7px;"><A style="color: #fff; text-decoration:none; font-size:7pt; line-height:10px; font-family: arial;" HREF="&#104;&#116;&#116;&#112;&#58;&#47;&#47;&#119;&#119;&#119;&#46;&#49;&#50;&#51;&#45;&#115;&#108;&#105;&#100;&#101;&#115;&#104;&#111;&#119;&#46;&#99;&#111;&#109;" TARGET="_blank">&#70;&#114;&#101;&#101;&#32;&#83;&#108;&#105;&#100;&#101;&#115;&#104;&#111;&#119;&#32;&#77;&#97;&#107;&#101;&#114;</A></div><style type="text/css">#slider {width: 720px; height: 400px; border: 3px solid #FFFFFF; border-radius: 0px; overflow: hidden; position: relative;  cursor: hand; cursor: pointer}#slider .slides {width: 2880px; height: 400px;  display: block; margin: 0; padding: 0;}#slider .slide {width: 720px; height: 400px; float: left; list-style-type: none;}.DIT160510 {position: absolute; max-width: 720px; margin: 0px;}.c12994  {position: absolute; bottom: 0px; width:100%;  padding: 12px; background-color: rgba(0, 0, 0, 0.7); color: #FFFFF; font-size:24pt; font-family:Tahoma; text-align:center; line-height:48px; z-index:33; -webkit-box-sizing: border-box; -moz-box-sizing: border-box; box-sizing: border-box;}</style><div id="slider"><ul class="slides">

			<li class="slide slide1">
			 <figure class="DIT160510">
			   
			  <img alt="image"  src="static/img/a.jpg" >
			 </figure>
			 </li>

			<li class="slide slide2">
			 <figure class="DIT160510">
			 <img alt="image"  src="static/img/b.jpg" >
			 
			 </figure>
			 </li>

			<li class="slide slide3">
			 <figure class="DIT160510">
			  <img alt="image"  src="static/img/c.jpg" >
			  <!-- IMG SRC="img/12994-3.jpg">  -->
			 </figure>
			 </li>

			<li class="slide slide1">
			 <figure class="DIT160510">
			 <img alt="image"  src="static/img/a.jpg" >
			 
			 </figure>
			 </li>

		</ul></div></div></div>

</body>
</html>