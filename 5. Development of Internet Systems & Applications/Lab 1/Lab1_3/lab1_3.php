<html>
	<head>
		<title>Lab1_3</title>
		
		<?php
			if(isset($_POST["first"]))
			{
				$visibility = "hidden";
			}
			else
			{
				$visibility = "visible";
				
				$first = $_POST["first"]; 
				$second = $_POST["second"]; 
				$sum = $first + $second;
				
				echo "Sum with get: " . $sum;
			}
		?>
   </head>

   <body>
		<div style="visibility:<?php $visibility; ?>">
		<form action="lab1_3.php" method="post">
			Number 1: <input type="text" name="first">
			<br>
			Number 2: <input type="text" name="second">
			<br>
			<input type="submit">
		</form>
		</div>
    </body>
</html>