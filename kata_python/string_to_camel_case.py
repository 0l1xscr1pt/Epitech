import re

def stringToCamelCase(string) :
    newString = ""
    i = 0

    if string == "" :
        return newString
    else :
        while i < len(string) :
            if re.search('[a-zA-Z]', string[i]):
                    newString += string[i]
            else :
                if re.search('[ _\-]', string[i]) and re.search('[a-z]', string[i + 1]):
                    print(string[i])
                    newString += string[i + 1].upper()
                    i += 1
            i += 1
        print(newString)
    return newString


stringToCamelCase("the_stealth_warrior")
# "theStealthWarrior"
stringToCamelCase("The-Stealth-Warrior")
# "TheStealthWarrior"