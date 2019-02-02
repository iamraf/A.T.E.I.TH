<!DOCTYPE html>
<html>
<?php

session_start();
if(!isset($_SESSION['username'])) {
	$_SESSION['username']='?';

}
require_once "internal/dbconnect.php";
?>
<head>
	<meta content="text/html; charset=utf-8" http-equiv="Content-Type" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	 <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="http://getbootstrap.com/favicon.ico">
	
    <title>BookStore</title>
    <!-- Bootstrap core CSS -->
    <link href="./bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="./bootstrap/css/dashboard.css" rel="stylesheet">
    <script src=".//bootstrap/js//jquery.min.js"></script>
    <script src="./bootstrap/js/bootstrap.min.js"></script>
</head>

<body>
    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container-fluid">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="index.php">BookStore</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav navbar-right">
            <li><a href="?p=start">Αρχική</a></li>
            <li><a href="?p=shopinfo">Το κατάστημα μας</a></li>
            <li><a href="?p=products">Τα Προϊόντα μας</a></li>
            <li><a href="?p=show_cart">Το καλάθι μου</a></li>
            <li><a href="?p=contact">Επικοινωνία</a></li>
            <li><a href="?p=login">Είσοδος</a></li>
          </ul>
        </div>
      </div>
    </nav>

<div class="container-fluid">	
		<div class="row">
			<div class="col-sm-3 col-md-2 sidebar">
				<?php
					
					print "<p>This is user: $_SESSION[username]</p>";
					require 'internal/menuleft.php';
					if($_SESSION['username']=='antonis') 
					{
					  print "<h2>User MENU</h2>";?>
					  <ul class="nav nav-sidebar">
						<li><a href="?p=orders">Παραγγελίες</a></li>
						<li><a href="?p=custdata">Στοιχεία Πελάτη</a></li>
						<li><a href="?p=logout">Έξοδος</a></li>
					  </ul>
					  <?php
					}
					elseif($_SESSION['username']=='admin') 
					{
						  print "<h2>Admin MENU</h2>";?>
						  <ul class="nav nav-sidebar">
							<li><a href="?p=custlist">Λίστα πελατών</a></li>
							<li><a href="?p=prodlist">Λίστα παραγγελιών</a></li>
							<li><a href="?p=logout">Έξοδος</a></li>
						  </ul>
					  <?php
					}
				?>
			</div>
			<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
				<?php
					if( ! isset($_REQUEST['p'])) 
					{
						$_REQUEST['p']='start';
					}
					$p = $_REQUEST['p'];
					print "must require page: internal/$p";
					echo "<br>";
					switch ($p)
					{
						case "start" :		require "internal/start.php";
											break;
						case "shopinfo": 	require "internal/shopinfo.php";
											break;
						case 'products':	require "internal/products.php";
											break;
						case 'show_cart':	require "internal/show_cart.php";
											break;
						case 'contact':		require "internal/contact.php";
											break;
						case "login" :		require "internal/login.php";
											break;
						case "do_login" :	require "internal/do_login.php";
											break;	
						case "custdata" :	require "internal/custdata.php";
											break;	
						case "prodlist" :	require "internal/prodlist.php";
											break;	
						case "custlist" :	require "internal/custlist.php";
											break;	
						case "orders" :		require "internal/orders.php";
											break;
						case "logout" :		require "internal/logout.php";
											break;	
						case "catinfo" :	require "internal/catinfo.php";
											break;		
						case "prodinfo" :	require "internal/prodinfo.php";
											break;		
						case "addtocart" :	require "internal/addtocart.php";
											break;											
						default: 	
							print "Η σελίδα δεν υπάρχει";
					}
				?>
			</div>
	</div>
</div>
<div id="footer"></div>
</body>
</html>
