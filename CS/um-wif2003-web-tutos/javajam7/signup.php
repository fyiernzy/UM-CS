
<h1>Sign Up Account</h1>
<form method="POST" action="processSignup.php">
    <div class="form-group">
        <label for="mName">*Name:</label><br />
        <input type="text" class="form-control col-sm-4" id="mName" name="mName" required/><br /><br />
    </div>

    <div class="form-group">
        <label for="mEmail" >*Email:</label><br />
        <input type="email" class="form-control col-sm-4" id="mEmail" name="mEmail" required/><br /><br />
    </div>

    <div class="form-group">
        <label for="password">*Password:</label><br />
        <input type="password" class="form-control col-sm-4" id="password" name="password" required/><br /><br />
    </div>

    <div class="form-group">
        <label for="rpassword">*Repeat Password:</label><br />
        <input type="password" class="form-control col-sm-4" id="rpassword" name="rpassword" required/><br /><br />
    </div>

    <input type="submit" value="Sign Up">
</form>
