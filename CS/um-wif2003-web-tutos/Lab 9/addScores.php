<h1>Enter Scores:</h1>
<form method="POST" action="grader.php" >
    Student
    <input list="students" name="studentID">
    <datalist id="students">
        <?php
        include 'config.php';

        $stmt = $pdo->query('SELECT studentID FROM students');
        while ($row = $stmt->fetch()){
            echo "<option value='".$row['studentID']."'>";
        }
        ?>
    </datalist>
    <br><br>
    Score 1 <input type="text" name="score1"/><br/>
    Score 2 <input type="text" name="score2"/><br/>
    Score 3 <input type="text" name="score3"/><br/>
    Score 4 <input type="text" name="score4"/><br/>
    Score 5 <input type="text" name="score5"/><br/>
    Score 6 <input type="text" name="score6"/><br/><br/>
    <input type="submit">
</form>

<h1>Enter Score ID:</h1>
<form method="POST" action="viewScores.php">
    Score ID <input type="text" name="scoreID"/><br/><br>
    <input type="submit" value="Submit Score ID">
</form>