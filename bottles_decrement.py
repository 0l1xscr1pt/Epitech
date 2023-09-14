def splitNumber(string) :
    i = 0
    number = ""

    while (i < len(string)) :
        if (string[i].isdigit()) :
            number += string[i]
        i += 1
    return number


def splitStr(string) :
    i = 0
    newStr = ""

    while (i < len(string)) :
        if (not(string[i].isdigit())) :
            newStr += string[i]
        i += 1
    return newStr


def lyrics(string) :
    i = 0
    onlyNumber = int(splitNumber(string))
    onlyString = splitStr(string)

    while (onlyNumber > i) :
        if (onlyNumber == 1) :
            onlyString = onlyString[:7] + onlyString[8:]
        finalStr = str(onlyNumber) + onlyString
        int(onlyNumber)
        print(finalStr)
        onlyNumber-= 1
    return 0

lyrics("99 bottles of age appropriate bottles on the wall")