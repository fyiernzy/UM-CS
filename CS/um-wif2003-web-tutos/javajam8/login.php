<h1>Login</h1>
<p>Please sign in</p>

<?php
    $action = $_GET['action'] ?? '';
    if($action == "login_failed"){
        echo "Access Denied.<br>";
        echo "Incorrect username or password.<br><br>";
    }
?>

<form method="POST" action="processLogin.php">
    <label for="mEmail">*Email:</label><br>
    <input type="email" class="form-control col-sm-4" id="mEmail" name="mEmail" required/><br /><br />

    <label for="password">*Password:</label><br />
    <input type="password" class="form-control col-sm-4" id="password" name="password" required/><br /><br />

    <input type="submit" value="Sign in">
</form>

