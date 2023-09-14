def returnClassInt():
    print("Un nombre entier:")
    nbr = input()

    if (type(nbr) == int) :
        return "int"
    else :
        return 1

returnClassInt()