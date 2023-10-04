<?php
    function calc(string $operator, int $nbr1, int $nbr2) {
        switch( $operator ) {
            case '+' :
                $result = $nbr1 + $nbr2;
                break;
            case '-' :
                $result = $nbr1 - $nbr2;
                break;
            case '*' :
                $result = $nbr1 * $nbr2;
                break;
            case '/' :
                if ($nbr1 == 0 || $nbr2 == 0) {
                    $result = "Cannot divide by 0";
                    break;
                }
                $result = $nbr1 / $nbr2;
                break;
            case '%' :
                $result = $nbr1 % $nbr2;
                break;
            default:
                $result = "Unknown operator";
        }
        return $result;
    }
?>