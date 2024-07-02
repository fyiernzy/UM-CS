<?php
    include "config.php";

    $uname = $_POST["mName"];
    $email = $_POST["mEmail"];
    $password = $_POST["password"];
    $rpassword = $_POST["rpassword"];

    if($password != $rpassword){
        echo "password mismatch";
        exit;
    }


    $validation = $pdo->prepare("SELECT COUNT(userid) as COUNT FROM members WHERE email = ?");
    $validation->bindValue(1, $email);
    $validation->execute();
    $count = $validation->fetch()[0];
    if($count >= 1) {
        echo "<h1>Email already exists</h1>";
        echo "<a href='signup.php'>Sign Up</a><br><br>";

    } else if($count == 0) {
        $statement = $pdo->prepare("INSERT INTO members (name, email, password) VALUES (?,?,?)");
        $statement->bindValue(1, $uname);
        $statement->bindValue(2, $email);
        $statement->bindValue(3, $password);
        $statement->execute();
        echo "<h1>Registration successful</h1>";
    }
    $pdo = null;

        echo "<a href='login.php'>Log In</a><br>";

?>