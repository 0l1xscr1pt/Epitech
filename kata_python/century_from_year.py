def centuryFromYear(year) :
    century = int(str(year)[:2])
    twoLastNumbers = str(year)[2:]

    if int(twoLastNumbers) > 0 :
        century += 1
    return century

centuryFromYear(1705)# 18
centuryFromYear(1900)# 19