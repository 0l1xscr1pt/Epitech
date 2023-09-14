def power(n) :
    i = ''
    numberValue = 0
    while len(i) < n :
        i += '4'
        numberValue += int(i);
        print(i, numberValue, '\n')
    
    return numberValue
power(3)