def grow(array):
    result = 1
    for i in array :
        result *= i
    print(result)
    return result
grow([1, 2, 4])