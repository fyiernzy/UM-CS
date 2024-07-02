<?php
    include "config.php";

    $statement = $pdo->prepare("SELECT * FROM scores WHERE ScoreID = ?");
    $statement->bindValue(1, $_POST["scoreID"]);
    $statement->execute();
    $score = $statement->fetch();

    if($score){
        echo "Database connected successfully";
        $studentID = $score["StudentID"];
        $score1 = $score["Score1"];
        $score2 = $score["Score2"];
        $score3 = $score["Score3"];
        $score4 = $score["Score4"];
        $score5 = $score["Score5"];
        $score6 = $score["Score6"];

        printf('
        <form method="POST" action="editScores.php" >
            Score 1 <input type="text" name="score1" value=%s /><br/>
            Score 2 <input type="text" name="score2" value=%s /><br/>
            Score 3 <input type="text" name="score3" value=%s /><br/>
            Score 4 <input type="text" name="score4" value=%s /><br/>
            Score 5 <input type="text" name="score5" value=%s /><br/>
            Score 6 <input type="text" name="score6" value=%s /><br/><br/>
            <input type="hidden" name="scoreID" value=%s>
            <input type="hidden" name="studentID" value=%s>
            <input type="submit" name="update" value="Update">
            <input type="submit" name="delete" value="Delete">
        </form>
        ', $score1, $score2,$score3,$score4,$score5,$score6,$_POST["scoreID"],$studentID);
    } else {
        echo "No scores found for the given ID.";
    }
    
    $pdo = null;
?>

