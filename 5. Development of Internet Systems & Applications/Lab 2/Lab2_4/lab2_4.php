<?php 
	echo "Name: " . $_GET["name"] . "<br>";
	echo "Address: " . $_GET["address"] . "<br>";
	echo "Phone: " . $_GET["phone"] . "<br>";
			
	if($_GET["gender"] == 'male')
	{
		echo "Gender: Male" . "<br>";
	}
	else
	{
		echo "Gender: Female" . "<br>";
	}
			
	if($_GET['age'] == "under")
	{
		echo "Age: Under 18" . "<br>";
	}
	else if($_GET['age'] == "mid")
	{
		echo "Age: 18-65" . "<br>";
	}
	else
	{
		echo "Age: 65 plus" . "<br>";
	}
			
	echo "Email: " . $_GET["email"] . "<br>";
			
	if(isset($_GET["send"]))
	{
		echo "Send emails" . "<br>";
	}
	else
	{
		echo "Do not send emails" . "<br>";
	}
?>