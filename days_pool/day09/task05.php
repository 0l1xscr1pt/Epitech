<?php
    function form_is_submitted() {
        if ($_POST["submit"])
            return true;
        return false;
    }


    function studies() {
        $theArray = ["pge", "msc", "coding", "wac"];
        $associedTo = ["PGE (Programme Grande Ecole)", "MSc Pro", "Coding Academy", "Web@cademie"];
        $i = 0;

        while($_POST["curriculum"] !== $theArray[$i]) {
            $i++;
        }

        echo " I'm a student of " . $associedTo[$i] . ".";
        return $associedTo[$i];
    }


    function whoami() {
        
        if ($_POST["name"] == null && $_POST["age"] == null)
            echo "I have no name.";

        else if ($_POST["name"] == null)
            echo "Hi, I have no name and I'm " . $_POST["age"] . " years old.";

        else if ($_POST["age"] == null)
            echo "Hi, my name is " . $_POST["name"] . ".";

        else
            echo "Hi, my name is " . $_POST["name"] . " and I'm " . $_POST["age"] . " years old.";
        
        if (!$_POST["curriculum"] == null)
            studies();
    }
?>