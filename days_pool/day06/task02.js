export function arraysAreEqual(arr1, arr2) {
    let i = 0;

    if (arr1.length !== arr2.length)
        return false

    while (i < arr1.length && i < arr2.length) {
        if (arr1[i] !== arr2[i])
            return false;
        i++;
    }
    return true;
}