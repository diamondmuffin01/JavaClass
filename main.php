<?
$mType = stripslashees($_GET['mType']);
$mFile = stripslashees($_GET['mFile']);
$title = stripslashees($_GET['title']);
$bgColor = stripslashees($_GET['bgColor']);
?>

<title><?  echo $title; ?></title>

<body style="background-color:#7487a7;">

<link href='https://fonts.googleapis.com/css?family=Courgette' rel='stylesheet' type='text/css'>
<div style="margin:120px auto 0; width: 70%; padding:54px; background-color:#ffffff; text-align:center;
border:#999999 solid 2px; border-radius:33px;">
<?
	print '<h2 style="font-family:Courgette; color:#888888;">' . $title. "</h2>\n";
	print '<p> <' . $mType . ' style="width:80%;" controls><source src="' . $mType . '/' . $mFile . '"></'
	. $mType . '></p>';
?> </div></body>
