<html>
<head>
<title>Bootstrap Case</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body><from>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="/front3">MySite</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="/front3">Home</a></li>
      <li class="dropdown">
    <a href="login.html">Login
        <span class="caret"></span></a>
        
      <li><a href="aboutus.html">AboutUs</a></li>
      <li><a href="register.html">Register</a></li>
	  <li><a href="services.html">Services</a></li>
    </ul>
  </div>
</nav>



<div id="myCarousel" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
    <li data-target="#myCarousel" data-slide-to="1"></li>
    <li data-target="#myCarousel" data-slide-to="2"></li>
    <li data-target="#myCarousel" data-slide-to="3"></li>
  </ol>

  <!-- Wrapper for slides -->
  <div class="carousel-inner" role="listbox">
    <div class="item active">
     <center> <img src="resources/images/4.jpg" style="width:1000px;height:500px"> </center>
    </div>

    <div class="item">
      <center><img src="resources/images/5.jpg" style="width:1000px;height:500px"></center>
    </div>

    <div class="item">
     <center> <img src="resources/images/9.png" style="width:1000px;heght:500px"></center>
    </div>

    <div class="item">
      <center><img src="resources/images/7.jpg" style="width:500px;heght:500px"></center>
    </div>

     <div class="item">
     <center> <img src="resources/images/8.jpg" style="width:500px;heght:500px"></center>
    </div>

  </div>

  <!-- Left and right controls -->
  <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
</body>
</html>