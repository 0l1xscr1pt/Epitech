def sort_array(array):
    newArray = []
    i = 0
    while i < len(array) :
        print(array[i])
        if array[i] % 2 == 1 :
            newArray += 'a'
        else :
            newArray += str(array[i])
        i += 1
    print(newArray)
    return newArray

sort_array([5, 3, 2, 8, 1, 4]) # [1, 3, 2, 8, 5, 4]
# sort_array([5, 3, 1, 8, 0]) # [1, 3, 5, 8, 0]
# sort_array([]) # []