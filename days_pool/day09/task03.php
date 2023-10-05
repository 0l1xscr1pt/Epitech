<?php
    function dynamic_body() {
        if ($_GET["page"] == null) {
            return '<p>Unknown page</p>';
        }

        switch ($_GET["page"]) {
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