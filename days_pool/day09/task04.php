<?php
    function whoami() {
        if ($_POST["name"] == null && $_POST["age"] == null)
            echo "I have no name.";
        else if ($_POST["name"] == null)
            echo "Hi, I have no name and I'm " . $_POST["age"] . " years old.";

        else if ($_POST["age"] == null)
            echo "Hi, my name is " . $_POST["name"] . ".";
        else
            echo "Hi, my name is " . $_POST["name"] . " and I'm " . $_POST["age"] . " years old.";
    }
?>