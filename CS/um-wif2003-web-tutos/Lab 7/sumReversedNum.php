<?php
    function reverseInteger($number){
        $number = strval($number);
        $rev_number = 0;
        while($number >1){
            $digit = $number % 10;
            $rev_number = ($rev_number * 10) + $digit;
            $number /= 10;
        }
        return $rev_number;
    }

    function computeReverseSum($num1, $num2){
        $num1 = reverseInteger($num1);
        $num2 = reverseInteger($num2);
        return $num1 + $num2;
    }

    if($_SERVER["REQUEST_METHOD"]==="POST"){
        $num1 = $_POST["num1"];
        $num2 = $_POST["num2"];
        echo computeReverseSum($num1, $num2);
    }
?>

<form method="POST" action="">
    Enter First Number: <input type="number" name="num1"><br>
    Enter Second Number: <input type="number" name="num2"><br>
    <input type="submit" value="submit">
</form>