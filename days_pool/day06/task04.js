export function fizzBuzz(num) {
    let result = "";

    for (let i = 1; i <= num; i++) {
        if ((i % 3 == 0) && (i % 5 == 0)) {
            result += "FizzBuzz";
        } else if(i % 3 == 0) {
            result += "Fizz";
        } else if(i % 5 == 0) {
            result += "Buzz";
        } else {
            result += i;
        }

        if (i + 1 <= num) {
            result += ", ";
        }
    }
    console.log(result);
    return result;
}