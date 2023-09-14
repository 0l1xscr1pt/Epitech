def fizzBuzz(number) :
    if (number % 3 == 0) :
        print("Fizz")
    elif (number % 5 == 0) :
        print("Buzz")
    elif ((number % 3) == 0 and (number % 5) == 0) :
        print("FizzBuzz")
    else :
        print(number)
    return 0
