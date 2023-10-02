export function countGs(str) {
    let nbrOfUppercase = 0;
    for(let i = 0; i < str.length ;i++) {
        if (str[i] === "G")
            nbrOfUppercase += 1;
    }
    return nbrOfUppercase;
}