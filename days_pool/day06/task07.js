export function arrayFiltering(array, validation) {
    let newArray = [];
    for(let i = 0; i < array.length; i++) {
        if (validation(array[i])) {
            newArray.push(array[i]);
        }
    }
    return newArray;
}
