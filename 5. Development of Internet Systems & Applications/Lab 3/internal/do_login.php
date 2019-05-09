Proccessing login.....
<br>

<?php
	$u = $_REQUEST['username'];
	$p = $_REQUEST['pass'];
	
	if($u == 'admin' && $p=='123') {
		print "Welcome admin";
		$_SESSION['username'] = 'admin';
		header ('Location: index.php');
	}elseif($u=='antonis' && $p=='123') {
			print "Welcome antonis";
			$_SESSION['username'] = 'antonis';
			header ('Location: index.php');
	} else {
		print "Unknown user";
		$_SESSION['username'] = '?';
	}
?>