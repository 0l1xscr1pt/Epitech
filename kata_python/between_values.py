def between(a, b) :
    _list = []
    i = a
    while i <= b :
        _list.append(i)
        i += 1
    return _list

between(1, 4) # [1, 2, 3, 4]