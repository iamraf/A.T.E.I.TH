<html>
	<head>
		<title>Lab2_1</title>
   </head>

   <body>
		<table id="table" <?php 
			for ($i = 0; $i < 10; $i++) 
			{
				echo "<tr>";
				
				for($j = 0; $j < 10; $j++)
				{
					$random = rand(0, 10);
					
					if($random < 5)
					{
						echo '<td style="background-color:red">' . $random . '</td>';
					}
					else
					{
						echo '<td style="background-color:green">' . $random . '</td>';
					}
				}
				
				echo "</tr>";
			} ?> >
		</table>
    </body>
</html>