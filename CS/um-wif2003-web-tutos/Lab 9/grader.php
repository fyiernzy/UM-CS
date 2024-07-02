<?php

    include "config.php";

    if($_SERVER["REQUEST_METHOD"] === "POST") {
        $studentID = $_POST["studentID"];
        $scores = array();
        for($i=1; $i<=6; $i++){
            array_push($scores, $_POST["score".$i]);
        }

        $total_score = 0;
        echo "You have entered 6 scores for ". $studentID. "<br>";
        printf("Average score for [");
        foreach ($scores as $score){
            printf($score. " ");
            $total_score += $score;
        }

        $avg_score = $total_score/6;
        $grade = checkGrade($avg_score);
        printf("] is %.1f<br>", $avg_score);
        printf("Average grade is %s<br>", $grade);

       
        $stmt = $pdo->prepare('INSERT INTO scores (StudentID, Score1, Score2, Score3, Score4, Score5, Score6, Average, Grade) VALUES (?,?,?,?,?,?,?,?,?)');
        $stmt->bindValue(1, $studentID);
        $stmt->bindValue(2, $scores[0]);
        $stmt->bindValue(3, $scores[1]);
        $stmt->bindValue(4, $scores[2]);
        $stmt->bindValue(5, $scores[3]);
        $stmt->bindValue(6, $scores[4]);
        $stmt->bindValue(7, $scores[5]);
        $stmt->bindValue(8, $avg_score);
        $stmt->bindValue(9, $grade);
        $stmt->execute();

        $last_id = $pdo->lastInsertId();
        $pdo = null;

        echo "<br>Database connected successfully<br>";
        echo "New record created successfully. Last inserted ID is: ". $last_id;

        echo "<br><br>";
        echo "<a href='viewScores.php?id=$last_id'>View Scores</a>";
        echo "<br>";
        echo "<a href='addScores.php'>Add New Scores</a>";

    } elseif ($_SERVER["REQUEST_METHOD"] === "GET") {
        $scores = array();
        for($i=1; $i<=6; $i++){
            array_push($scores, $_GET["score".$i]);
        }

        $total_score = 0;
        printf("Average score for [");
        foreach ($scores as $score){
            printf($score. " ");
            $total_score += $score;
        }

        $avg_score = $total_score/6;
        printf("] is %.1f<br>", $avg_score);
        printf("Average grade is %s<br>", checkGrade($avg_score));
    }

    function checkGrade($score){
        if($score >=80 && $score <=100){
            return "A";
        } elseif ($score >= 60) {
            return "B";
        } elseif ($score >= 40) {
            return "C";
        } elseif ($score >= 20) {
            return "D";
        } elseif ($score >= 1) {
            return "E";
        } else
            return "F";
    }
?>