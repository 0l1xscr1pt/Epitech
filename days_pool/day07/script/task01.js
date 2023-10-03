let count = 0; 
let button = document.querySelector("footer");

button.addEventListener("click", function() {
    count += 1;
    console.log(count);
});