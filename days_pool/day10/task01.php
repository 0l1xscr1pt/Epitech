<?php 
    if (isset($_GET["name"]) == true) {
        header("Content-Type: application/json");
        header("Access-Control-Allow-Origin: *");
        echo json_encode(["name" => $_GET["name"]]);
    }
?>