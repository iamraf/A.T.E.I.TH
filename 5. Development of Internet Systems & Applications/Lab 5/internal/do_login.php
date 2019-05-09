<br>

<?php
		
	$u = $_REQUEST['username'];
	$p = $_REQUEST['pass'];
	if($u == 'admin' && $p=='123') 
	{
		print "Welcome admin";
		$_SESSION['username'] = 'admin';
		header ('Location: index.php');
	}
	else
	{
		$sql = "SELECT * FROM customer WHERE uname=? AND passwd=?";
		if($stmt = $mysqli->prepare($sql))
		{
			$stmt->bind_param("si", $u,$p);
			$stmt->execute();
			$result=$stmt->get_result();
			if($row = $result->fetch_array())
			{
				$_SESSION['username'] = $row["uname"];
				$_SESSION['userID'] = $row["ID"];
				header ('Location: index.php');
			}
			else
			{
				echo "Lathos kodikos";
				$_SESSION['username'] = "?";
			}
		}	
		else
		{
			echo "Error1: ".$mysqli->error();
		}
		
		$stmt->close();
	}
?>