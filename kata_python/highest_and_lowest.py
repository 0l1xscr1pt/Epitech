def highAndLow(listString) :
    _list = []
    i = 0
    j = 0

    while i < len(listString) :
        if not listString[i] == " ":
            _list += listString[i]
        if listString[i] == "-" :
            _list += listString[i] + listString[i + 1]
            i += 1
        i += 1

    print(_list)
    # stringMaxAndMin = ""
    # stringMaxAndMin = min(int(stringOfNumbers))

    # print(stringMaxAndMin)
    #return stringMaxAndMin

highAndLow("1 2 3 4 5")  # return "5 1"
highAndLow("1 2 -3 4 5") # return "5 -3"
highAndLow("1 9 3 4 -5") # return "9 -5"
