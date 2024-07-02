<?php
    include_once("config.php");
    session_start();

    $email = $_POST["mEmail"];
    $pword = $_POST["password"];

    $validation = $pdo->prepare("SELECT * FROM members WHERE email = ? AND password = ?");
    $validation->bindValue(1, $email);
    $validation->bindValue(2, $pword);
    $validation->execute();
    
    $user = $validation->fetch();
    $userid = $user["userid"];
    $user_email = $user["email"];

    $pdo = null;

    if($user){
        $_SESSION["logged_in"] = true;
        $_SESSION["user_id"] = $userid;
        $_SESSION["user_email"] = $user_email;

        header("Location: profile.php?action=login_success");
        exit();
    } else {
        header("Location: login.php?action=login_failed");
        exit();
    }
?>