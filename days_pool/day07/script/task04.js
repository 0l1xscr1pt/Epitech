let body = document.querySelector("body");
let options = document.querySelector("select");
let more = document.querySelector("button");
let less = document.querySelector("button:nth-child(2)");
let para = document.querySelector("p");


options.addEventListener("change", (event) => {
    body.style.backgroundColor = event.target.value;
});

more.addEventListener("click", () => {
    para.style.fontSize = "";
});

less.addEventListener("click", () => {
    para.style.fontSize = "x-small";
});
