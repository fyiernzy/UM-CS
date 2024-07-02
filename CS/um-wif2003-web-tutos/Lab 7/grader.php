
<?php
    $scores = [90, 98, 89, 100, 100, 86];
    // $scores = [40, 65, 77, 82, 80, 54, 73, 63, 95, 49];
    $count = 0;
    $total_score = 0;

    echo("Average score for [");
    foreach ($scores as $score){
        $total_score += $score;
        $count++;
        echo($score. " ");
    }
    $avg_score = $total_score/$count;
    printf("] is %.1f<br>", $avg_score);
    $avg_grade = checkGrade($avg_score);
    printf("Average grade is %s<br>", $avg_grade);

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
