
<?php

$pid = $_REQUEST['prod_id']; 
if(!isset($_SESSION['cart'])) {
 $_SESSION['cart']=array();
}
if(!isset($_SESSION['cart'][$pid])) {
 $_SESSION['cart'][$pid]=0;
}
$_SESSION['cart'][$pid] += $_REQUEST['posotita']; 

print "Προστεθηκε στο καλαθι";
?>