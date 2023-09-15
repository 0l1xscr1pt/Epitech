def smallerThan(n) :
    theList = [1, 2, 3, 4, 5, 6, 9, 8, 10, 8]
    print(list(filter(lambda x: x <= n, theList)))
smallerThan(7)
