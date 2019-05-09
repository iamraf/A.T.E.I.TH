<?php

	$sql = "INSERT INTO orders(Customer,oDate) VALUES ({$_SESSION['userID']},now()) ";
	$res = $mysqli->query($sql);
	if(!$res)
	{
		echo "(".$mysqli->errno.") ".$mysqli->error;
	}
	$order = mysqli_insert_id($mysqli);	
	
	$cart = $_SESSION['cart'];
	$i=1;
	foreach($cart as $c=>$x)
	{
			print $i++;
			$quantity = $x;
			$productID = $c;
			 $sql2="INSERT INTO orderdetails(Orders,Quantity,Product) VALUES($order,$quantity,$productID) ";
			 $result = $mysqli->query($sql2);
			if (!$result) {
				
				echo "(".$mysqli->errno.")".$mysqli->error;
			 }
	}
	unset($_SESSION['cart']);
	print "Η παραγγελια σου πραγματοποιηθηκε με επιτυχια!";
?>