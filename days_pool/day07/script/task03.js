let button = document.querySelector("footer div");
let stock = "";

window.addEventListener("keydown", (event) => {
    if (event.key.length == 1) {
        stock += event.key;
        button.innerText = stock.slice(-42);
    }
});