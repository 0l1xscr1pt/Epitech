import re

def kebabize(string):
    newString = ""

    for i in range(len(string)) :
        if (string[i] == "-" or string[i] == "_" or re.search("[0-9]", string[i])) :
            i += 1
        elif (re.search("[A-Z]", string[i])) :
            if (i == 0) :
                newString += string[i].lower()
            else :
                if (newString == "") :
                    newString += string[i].lower()
                else :
                    newString += "-" + string[i].lower()
        else :
            newString += string[i]
    return newString