<table class='table table-striped'>
<tr>
	<th>Title</th>
	<th>Price</th>
</tr>
<?php

$sql = "select * from product where Category={$_REQUEST['catid']}";

if(!($res = $mysqli->query($sql)))
{
	echo "(".$mysqli->errno.") ".$mysqli->error;
}
else
{
	
	while($row = $res->fetch_assoc())
	{
	print "<tr><td><a href='?p=prodinfo&id=$row[ID]'>$row[Title]</a></td>".
			"<td>$row[Price]</td></tr>";
	}
}

?>
</table>