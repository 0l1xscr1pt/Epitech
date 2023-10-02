export function objectsDeeplyEqual(cmp1, cmp2) {
    return JSON.stringify(cmp1) === JSON.stringify(cmp2) ? true : false;
}
