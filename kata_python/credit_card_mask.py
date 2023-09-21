def creditCardMask(string) :
    newString = ""
    if len(string) <= 4 :
        return string
    else :
        newString += "#" * (len(string) - 4) + string[-4::]
    return newString


creditCardMask("4556364607935616") # --> "############5616"