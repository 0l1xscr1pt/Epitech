def sumOfDigits(number) :
    numberInStr = str(number)
    i = 0
    result = 0

    while (i < len(numberInStr)) :
        result += int(numberInStr[i])
        i+= 1
    
    print(result)
    return result

sumOfDigits(123434565)