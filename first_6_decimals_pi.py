def calculatFirstDecimals() :
    i = 1
    result = 0

    while (i < 10000000) :
        result += (1 / i) - (1 / (i + 2))
        i+= 4
    result *= 4
    result = str(result)[:7]
    # print(result)
    return result

calculatFirstDecimals()