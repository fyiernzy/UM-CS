<?php
    include_once("config.php");

    function checkPassword($pwd1, $pwd2){
        return $pwd1 === $pwd2;
    }

    if(
        isset($_POST["mName"]) && !empty($_POST["mName"]) &&
        isset($_POST["mEmail"]) && !empty($_POST["mEmail"]) &&
        isset($_POST["password"]) && !empty($_POST["password"]) &&
        isset($_POST["rpassword"]) && !empty($_POST["rpassword"])
    ) {
        $uname = $_POST["mName"];
        $email = $_POST["mEmail"];
        $password = $_POST["password"];
        $rpassword = $_POST["rpassword"];

        if(checkPassword($password,$rpassword)){
            $validation = $pdo->prepare("SELECT COUNT(userid) as COUNT FROM members WHERE email = ?");
            $validation->bindValue(1, $email);
            $validation->execute();
            $count = $validation->fetch()[0];
            if($count >= 1) {
                echo "<h1>Email already exists</h1>";
                echo "<a href='signup.php'>Sign Up</a><br><br>";

            } else if($count == 0) {
                
                $hashed_password = password_hash($password, PASSWORD_DEFAULT);
                
                $statement = $pdo->prepare("INSERT INTO members (name, email, password) VALUES (?,?,?)");
                $statement->bindValue(1, $uname);
                $statement->bindValue(2, $email);
                $statement->bindValue(3, $hashed_password);
                $statement->execute();
                echo "<h1>Registration successful</h1>";
            }
            $pdo = null;

        } else{
                echo "<h1>Passwords did not match! Try again.</h1>";
                echo "<a href='signup.php'>Sign Up</a><br><br>";
        }
         echo "<a href='login.php'>Log In</a><br>";
    }

    
?>