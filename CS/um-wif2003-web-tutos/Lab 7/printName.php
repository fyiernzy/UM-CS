<?php
function printName($first_name, $last_name, $number) {
    for ($i = 0; $i < $number; $i++) {
        printf("%s %s<br>", $first_name, $last_name);
    }
}

if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    $first_name = $_POST['first_name'];
    $last_name = $_POST['last_name'];
    $number = (int) $_POST['number'];

    printName($first_name, $last_name, $number);
}
?>

<form method="POST" action="">
    First Name is: <input type="text" name="first_name"><br>
    Last Name is: <input type="text" name="last_name"><br>
    Times to print: <input type="number" name="number"><br>
    <input type="submit" value="Submit">
</form>