def quarterOfYear(month) :
    if number >= 1 and number <= 3 :
        return 1
    elif number >= 4 and number <= 6 :
        return 2
    elif number >= 7 and number <= 9 :
        return 3
    elif number >= 10 and number <= 12 :
        return 4
    else :
        return 'Error'

quarterOfYear(3) # 1
quarterOfYear(8) # 3
quarterOfYear(11) # 4