<?php
    $uname = $_POST["mName"];
    $email = $_POST["mEmail"];
    $password = $_POST["password"];
    $rpassword = $_POST["rpassword"];

    if($password != $rpassword){
        echo "password mismatch";
        exit;
    }

    $data = "$uname, $email, $password, $rpassword\n";
    $file = fopen("javamember.txt", "a");
    fwrite($file, $data);
    fclose($file);

    header("Location: profile.php?action=login_success");
    exit;
?>