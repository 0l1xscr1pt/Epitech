import re

def disemvowel(string):
    i = 0
    newString = ""

    while i < len(string) :
        if re.search("[^aeiouAEIOU]", string[i]) :
            newString += string[i]
        i += 1
    return newString

disemvowel("This website is for losers LOL!") # "Ths wbst s fr lsrs LL!".