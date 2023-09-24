import re

def alpha_position(string) :
    newString = ""
    i = 0

    while i < len(string) :
        if re.search("[^A-Za-z]", string[i]) :
            i += 1
            
        elif re.search("[A-Z]", string[i]) :
            if i < 1 :
                newString += str(ord(string[i]) - 64)
            else :
                newString += str(ord(string[i]) - 64) + " "

        elif re.search("[a-z]", string) :
            if i < 1 :
                newString += str(ord(string[i]) - 64)
            else :
                newString += str(ord(string[i]) - 96) + " "
        i += 1
    print(newString)
    return newString
alpha_position("The sunset sets at twelve o' clock.")
alpha_position("a ")
