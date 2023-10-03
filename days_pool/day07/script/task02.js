let button = document.querySelector("footer div");

button.addEventListener("click", function() {
    let userName = prompt("What's your name ?");

    while (userName == null)
        userName = prompt("What's your name ?");

    if (userName !== null) {
        if(confirm("Are you sure that " + userName + " is your name ?"))
            alert("Hello " + userName + " !");
    }

    let helloName = "Hello " + userName + " !";
    button.innerText = helloName;

});