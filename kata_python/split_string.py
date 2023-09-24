def solution(_string):
    _list = []
    i = 0
    while(i % 2 == 0 and i < len(_string)):
        _list.append(_string[i] + _string[i + 1])
        i += 2
    print(_list)
    return _list

solution("abcdef")