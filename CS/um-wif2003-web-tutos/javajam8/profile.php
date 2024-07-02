<h1>Welcome to JavaJam Coffee House</h1>
<?php
    include_once("config.php");
    session_start();

    if (isset($_SESSION['logged_in']) && 
        $_SESSION['user_id'] && 
        $_SESSION['user_email'] && 
        $_SESSION['logged_in']==true )
    {
        $id = $_SESSION["user_id"];
        $statement = $pdo->query("SELECT name FROM members WHERE userid=$id");
        $name = $statement->fetch()["name"];
        $email = $_SESSION['user_email'];
        
    }
?>

<h4>Hi <?php echo $name ?> Welcome to JavaJam Coffee House</h4>
<table>
    <tr>
        <th>Name: </th>
        <td><?php echo $name; ?></td>
    </tr>
    <tr>
        <th>Email: </th>
        <td><?php echo $email; ?></td>
    </tr>
</table>
<a href="logout.php">Logout</a>
