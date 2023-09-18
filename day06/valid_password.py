import re

dictionnary = {
    "lowercase" : "caractères minuscule",
    "uppercase" : "caractères majuscule",
    "characters" : "caractères",
    "specialCharacters" : "caractères spéciaux", 
    "number" : "nombres"
}

def callFunctions(_type, nbr, string):
    count = _type(string)
    if (count >= nbr) :
        print("Valid password !")
    else :
        print(f"Il manque {nbr - count} {dictionnary[_type.__name__]}")


def lowercase(string) :
    count = 0

    for i in range(len(string)) :
        if re.search('[a-z]', string[i]):
            count += 1
    return count


def uppercase(string) :
    count = 0
    for i in range(len(string)) :
        if re.search('[A-Z]', string[i]):
            count += 1
    return count


def characters(string) :
    count = 0
    for i in range(len(string)) :
        if re.search('[a-zA-Z]', string[i]):
            count += 1
    return count


def specialCharacters(string) :
    count = 0
    for i in range(len(string)) :
        if re.search('[^a-zA-Z0-9]', string[i]):
            count += 1
    return count


def number(string) :
    count = 0
    for i in range(len(string)) :
        if re.search('[0-9]', string[i]):
            count += 1
    return count

callFunctions(lowercase, 4, "a12")
