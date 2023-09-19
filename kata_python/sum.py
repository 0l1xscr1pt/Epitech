def unique_sum(_list):
    result = 0
    uniqueList = []
    if len(_list) == 0 :
        return None

    for i in _list :
        if i not in uniqueList :
            uniqueList.append(i)


    for j in range(len(uniqueList)) :
        result += uniqueList[j]
    return result

unique_sum([ 1, 2, 3])