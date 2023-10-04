<?php
    function calc_average($theArray) {
        $average = 0;
        foreach($theArray as $value) {
            $average += $value;
        }
        $average /= count($theArray);
        $average = round($average, 1);
        return $average;
    }
?>