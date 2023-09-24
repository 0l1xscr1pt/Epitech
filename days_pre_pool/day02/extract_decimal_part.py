def extractInteger(number) :
    numberInStr = str(number)
    i = 0
    result = ""

    while (i < len(numberInStr)) :
        if (numberInStr[i] == ".") :
            i += 1
            while (i < len(numberInStr)) :
                result += numberInStr[i]
                i += 1
        i += 1
    print(result)
    return result

extractInteger(12.24)
extractInteger(3424242.8412)