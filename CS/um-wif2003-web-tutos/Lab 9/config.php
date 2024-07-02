<?php
    $DATABASE_HOST_NAME = "localhost";
    $DATABASE_NAME="lab9";
    $USERNAME="user1";
    $PASSWORD="userlabc";

    try {
        $connString = "mysql:host=$DATABASE_HOST_NAME;dbname=$DATABASE_NAME";
        $pdo = new PDO($connString, $USERNAME, $PASSWORD);
        $pdo->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
    }
    catch (PDOException $e) {
        die($e->getMessage());
    }
?>