def reduceFractions(number, toMultiply) :
    i = 1

    while (i <= toMultiply) :
        if ((number % i) == 0 and (toMultiply % i) == 0) :
            communDenominator = i
        i += 1
    # print(communDenominator)
    return communDenominator

# reduceFractions(25, 30)
# reduceFractions(42, 50)
# reduceFractions(9, 3)