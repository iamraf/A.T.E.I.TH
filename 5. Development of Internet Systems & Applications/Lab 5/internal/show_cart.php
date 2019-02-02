<?php
if (isset($_GET['deleteCart'])) 
      unset($_SESSION['cart']);
 
if(!isset($_SESSION['cart']))
{
	print "Το καλάθι είναι άδειο";
}
else
{?>
<form action="?p=submitOrder" method="post">
<table class='table table-striped'>
<tr>
	<th>Title</th>
	<th>Quantity</th>
	<th>Price</th>
</tr>
<?php

$sql = "select * from product where ID=?";
$stmt = $mysqli->prepare($sql);
$sum = 0;

foreach($_SESSION['cart'] as $p => $q ) 
{
 $stmt->bind_param("i", $p);
 $stmt->execute();
 $result = $stmt->get_result();
 $row = $result->fetch_assoc();
 print "<tr>";
 print "<td>$row[Title]</td><td>$q</td><td>" . ($q * $row['Price']);
 print "</td></tr>";
 $sum += ($q * $row['Price']);
}
?>
<tr style="background-color:grey">	
	<td  style="font-size: 20px; color:white">
		Σύνολο: <?php print $sum; ?>
	</td>
	<td>
		<input type='submit' name='submit' value='Αγορά'>
	</td>
	<td>
		<input type='button' onclick="window.location='?p=show_cart&deleteCart=1'"  value='Αδεισμα καλαθιου'>
	</td>
</tr>
<?php
}
?>
</table>
</form>