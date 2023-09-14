def extractInteger(number) :
    i = 0
    numberInStr = str(number)
    result = ""

    while (i < len(numberInStr) and numberInStr[i] != ".") :
        result += numberInStr[i]
        i += 1
    print(result)
    return result

extractInteger(12.24)
extractInteger(3424242.8412)