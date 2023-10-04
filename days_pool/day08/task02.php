<?php 
function dog_bark($woof_nb) {
    if ($woof_nb >= 1) {
        for($i = 0; $i < $woof_nb; $i++) {
            if (($i + 1) < $woof_nb)
                echo "woof ";
            else
                echo "woof";
        }
    }
    echo "\n";
}
?>