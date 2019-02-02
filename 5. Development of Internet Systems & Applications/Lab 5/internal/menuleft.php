<?php

$sql = 'select * from category order by Name';

if(!($res = $mysqli->query($sql)))
{
	echo "(".$mysqli->errno.") ".$mysqli->error;
}
else
{
	while($row = $res->fetch_assoc())
	{
		print "<li><a href='index.php?p=catinfo&catid=$row[ID]'>$row[Name]</a></li>";
	}
}
?>
