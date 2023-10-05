<?php 

    function render_body($theString) {
        switch ($theString) {
            case 'home':
                include('home.html');
                break;
            case 'php' :
                include('php.html');
                break;
            case 'sql' :
                include('sql.html');
                break;
            default :
                echo '<p>Unknown page</p>';
                break;
        }
    }
?>