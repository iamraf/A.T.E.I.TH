<form action='' method='get'>
<input type='hidden' name='p' value='addtocart'/>
<table class='table table-striped'>
<tr>
	<th>Title</th>
	<th width='35%'>Description</th>
	<th>Price</th>
	<th>Quantity</th>
	<th>Add to cart</th>
</tr>

<?php

$sql = "select * from product where ID={$_REQUEST['id']}";

if(!($res = $mysqli->query($sql)))
{
	echo "(".$mysqli->errno.") ".$mysqli->error;
}
else
{
	while($row = $res->fetch_assoc())
	{
		print "<tr><td>$row[Title]</td>".
				"<td>$row[Description]</td>".
				"<td>$row[Price]</td>".
				"<td><input type='number' name='posotita' value='1'/></td>".
				"<input type='hidden' name='prod_id' value='{$row["ID"]}'/>".
				"<td><input type='submit' name='submit' value='Προσθήκη'></td>".
			  "</tr>";
	}
}
?>
</table>
</form>