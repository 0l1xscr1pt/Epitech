def has_unique_chars(string):
    i = 0
    while i < len(string) :
        j = 1 + i
        while j < len(string) :
            if string[i] != string[j] :
                j += 1
            else :
                return False
        i += 1
    return True

has_unique_chars("1abc1") #return false
has_unique_chars("1abc") #return true