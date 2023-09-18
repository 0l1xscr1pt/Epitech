import re

def callFunctions(_type, nbr, string):
    count = _type(string)
    print("count ->", count, "nbr ->", nbr, string)

    if (count >= nbr) :
        print("valid password")
    else :
        print("invalid password")


def lowercase(string) :
    count = 0
    for i in range(len(string)) :
        if re.search('[a-z]', string[i]):
            count += 1
    print(count)
    return count

def uppercase(string) :
    count = 0
    for i in range(len(string)) :
        if re.search('[A-Z]', string[i]):
            count += 1
    print(count)
    return count

def characters(string) :
    count = 0
    for i in range(len(string)) :
        if re.search('[a-zA-Z]', string[i]):
            count += 1
    print(count)
    return count

def specialCharacters(string) :
    count = 0
    for i in range(len(string)) :
        if re.search('[^a-zA-Z0-9]', string[i]):
            count += 1
    print(count)
    return count

def number(string) :
    count = 0
    for i in range(len(string)) :
        if re.search('[0-9]', string[i]):
            count += 1
    print(count)
    return count

callFunctions(number, 4, "a1231c")
