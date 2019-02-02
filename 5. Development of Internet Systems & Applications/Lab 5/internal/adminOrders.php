<?php

if($_SESSION['username']=='admin') 
{
	print '<input type="checkbox" name="Ολοι" value="Ολοι" checked>Ολοι';
		$sql = 'select * from customer';
		if(!($res = $mysqli->query($sql)))
		{
			echo "(".$mysqli->errno.") ".$mysqli->error;
		}
		else
		{
			while($row = $res->fetch_assoc())
			{
				print "<li><a href='?p=adminOrders&custid=$row[ID]'>$row[Fname]</a></li>";
			}
		}
	
	if(isset($_REQUEST['custid']))
	{
		$sql2 = "select * from orders where Customer={$_REQUEST['custid']}";
		if(!($res2 = $mysqli->query($sql2)))
		{
			echo "(".$mysqli->errno.") ".$mysqli->error;
		}
		else
		{
			print "<table border=1>";
			print "<tr>";
			print "<th>ID</th>";
			print "<th>Date</th>";
			print "</tr>";
			while($row = $res2->fetch_assoc())
			{
				print "<tr>";
				print "<td><a href='?p=adminOrders&ordid=$row[ID]'>$row[ID]</a></th>";
				print "<td>$row[oDate]</td>";
				print "</tr>";
			}
			print "</table>";
		}
	}
	
	if(isset($_REQUEST['ordid']))
	{
		
		$sql2 = "select * from product inner join orderdetails on product.ID=orderdetails.Product where Orders={$_REQUEST['ordid']}";
		if(!($res2 = $mysqli->query($sql2)))
		{
			echo "(".$mysqli->errno.") ".$mysqli->error;
		}
		else
		{
			print "<table border=1>";
			print "<tr>";
			print "<th>Product Name</th>";
			print "<th>Quantity</th>";
			print "</tr>";
			while($row = $res2->fetch_assoc())
			{
				print "<tr>";
				print "<td>$row[Title]</th>";
				print "<td>$row[Quantity]</td>";
				print "</tr>";
			}
			print "</table>";
		}
	}

}
else
{
	print "Μονο ο Administrator για εχεις προσβαση στην σελιδα";
}
	


?>