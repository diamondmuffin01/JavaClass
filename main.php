lol
<?php
$mType = stripslashes($_GET['mType']);
$mFile = stripslashes($_GET['mFile']);
$title = stripslashes($_GET['title']);
?>
<title> <?php  echo $title; ?></title>
<body style="background-color:#7487a7;">
<link href='https://fonts.googleapis.com/css?family=Courgette' rel='stylesheet' type='text/css'>
<div style="margin:120px auto 0; width: 70%; padding:54px; background-color:#ffffff; text-align:center; border:#999999 solid:2px; border-radius:33px;">
<?php
print '<h2 style="font-family:Courgette; color:#888888;"> ' . $title . "</h2>\n";
print '<p><' . $mType . ' style="width:80%;" controls><source src="' . $mFile . '"></' . $mType . '></p>';
?>
</div>
</body>
