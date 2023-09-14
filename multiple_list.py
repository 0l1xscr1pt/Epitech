def createLine(number, increment) :
    i = increment
    line = []
    while (i < number) :
        line.append(str(i))
        i += increment
    reverse = line[:: -1]
    result = ' '.join(reverse)
    return result


def multiple_list(number, increment) :
    lines = ""
    while ((increment * 2) <= number) :
        lines += createLine(number, increment) + '\n'
        increment += 1
    print(lines)
    return 0

multiple_list(27, 2)