<?php
//get the search term from the query parameter
$searchTerm = $_GET['q'];

//Perform your search input logic here (e.g.,query a database)
//$searchResults = performSearch($searchTerm);

//for demonstartion purposes.let's assume you have an array of results
$sarchResults = array("Result 1","Result 2","Result 3");

//output the Results as HTML
foreach($searchTerm as $result) {
    echo "<div class ='result'>$result</div>";
}
?>