<?php
    function get_shortest($theList) {
        foreach ($theList as $value) {
            $arrayOfLength[] = strlen($value);
        }
        $value = array_search(min($arrayOfLength), $arrayOfLength);
        return $theList[$value];
    }
?>