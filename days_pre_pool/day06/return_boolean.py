import re

def lowercase(string, n) :
    return bool(re.search('[a-z]', string[n]))

def uppercase(string, n) :
    return bool(re.search('[A-Z]', string[n]))

def characters(string, n) :
    return bool(re.search('[a-zA-Z]', string[n]))

def specialCharacters(string, n) :
    return bool(re.search('[^a-zA-Z0-9]', string[n]))

def number(string, n) :
    return bool(re.search('[0-9]', string[n]))

lowercase("a_c", 1)
uppercase("a_c", 1)
characters("a_c", 1)
specialCharacters("a_c", 1)
number("a_c", 1)