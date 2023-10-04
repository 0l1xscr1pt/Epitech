<?php 
    function theCount($string, $start) {
        $i = $start;
        $similar = 0;
  
        for ($i = $start; $i < strlen($string); $i++) {
            $similar++;
            if($i + 1 < strlen($string) && $string[$i] !== $string[$i + 1]) {
                return $similar;
            }
        }
        $similar = strval($similar);
        return $similar;
    }

    
    function sequence($number) {
        $index = 0;
        $temporary = "1";
        $result = "";
        $j = 0;

        echo $temporary . PHP_EOL;
        for($i = 0; $i < $number; $i++) {
            $result = "";
            $j = 0; 
            while( $j < strlen($temporary)) {
                $count = theCount($temporary, $j);
                $result .= $count . $temporary[$j];
                $j+= $count;
            }
            $temporary = $result;
            echo $temporary . PHP_EOL;
        }
    }
?>