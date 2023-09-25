def find_uniq(_list):
    unique = 0
    for i in _list :
        if _list.count(i) == 1 :
            if (type(i) == float) :
                unique = float(i)
            else :
                unique = int(i)
    print(unique)
    return unique
