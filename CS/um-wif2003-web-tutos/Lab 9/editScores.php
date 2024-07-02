<?php
    include "config.php";

    if($pdo != null){
        echo "Database connected successfully<br>";
        if(isset($_POST["update"])){
            $statement = $pdo->prepare("UPDATE scores SET Score1 = ?, Score2 = ?, Score3 = ?, Score4 = ?,Score5 = ?, Score6 = ? WHERE ScoreID = ?");
            $statement->bindValue(1, $_POST["score1"]);
            $statement->bindValue(2, $_POST["score2"]);
            $statement->bindValue(3, $_POST["score3"]);
            $statement->bindValue(4, $_POST["score4"]);
            $statement->bindValue(5, $_POST["score5"]);
            $statement->bindValue(6, $_POST["score6"]);
            $statement->bindValue(7, $_POST["scoreID"]);
            $statement->execute();
            echo "Record updated successfully for ". $_POST["studentID"]. "<br>";
            
        } elseif (isset($_POST["delete"])) {
            $statement = $pdo->prepare("DELETE FROM scores WHERE ScoreID = ?");
            $statement->bindValue(1, $_POST["scoreID"]);
            $statement->execute();
            echo "Record deleted successfully<br>";
        }
    } else {
        echo "Failed to connect database";
    }

    echo "<br><a href='addScores.php'>Add New Scores</a>";
    $pdo = null;
?>