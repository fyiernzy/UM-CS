<?php
    if($_SERVER["REQUEST_METHOD"] === "POST") {
        $scores = array();
        for($i=1; $i<=6; $i++){
            array_push($scores, $_POST["score".$i]);
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