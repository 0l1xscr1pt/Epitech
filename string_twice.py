def stringTwice(string) :
    i = 0
    newString = ""

    while (i < len(string)) :
        newString += string[i] + string[i]
        i += 1
    print(newString)
    return 0

stringTwice(input())