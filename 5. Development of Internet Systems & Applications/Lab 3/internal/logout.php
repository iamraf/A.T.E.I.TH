<p>
You just logout!

<?php 
	session_unset();
	session_destroy();
	header ('Location: index.php?p=login');
?>

</p>