<?php
$file = $_FILES['file'];
if($file["size"] > 0) {
	// 生成文件名称
	$ext = substr($file["name"], strrpos($file["name"],'.') + 1);
	$filename = md5($file["name"].time()).'.'.$ext;
	@move_uploaded_file($file["tmp_name"], './tmp/'.$filename);
	die('ok:');
}
?>