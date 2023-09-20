import re

def breakCamelCase(string) :
    newString = ""
    for i in string :
        if re.search('[A-Z]', i) :
            newString += ' ' + i
        else :
            newString += i
    return newString

breakCamelCase("helloWorld") 
# "hello World"
