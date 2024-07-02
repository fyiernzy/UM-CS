<h1>Welcome to JavaJam Coffee House</h1>
<?php
    $file = "javamember.txt";
    $data = file($file);
    $lastline = $data[count($data) - 1];
    $userData = explode(", ", $lastline);
?>

<h4>Hi <?php echo $userData[0] ?> Welcome to JavaJam Coffee House</h4>
<table>
    <tr>
        <th>Name: </th>
        <td><?php echo $userData[0]; ?></td>
    </tr>
    <tr>
        <th>Email: </th>
        <td><?php echo $userData[1]; ?></td>
    </tr>
</table>
