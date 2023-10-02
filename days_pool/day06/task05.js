function range(start, end, step) {
    var arrayOfNumber = [];
    var i = 0;

    if (step === undefined) {
        step = 1;
    }

    if (start < end) {
        for(i = start; i <= end; i += step)
            arrayOfNumber.push(i);
    } else {
        for(i = start; i >= end; i += step)
            arrayOfNumber.push(i);
    }
    return arrayOfNumber;
}

module.exports = {range};