import time

def power(number, power) :
    startingTime = time.time()
    result = 42 ** 168
    duration = time.time()- startingTime

    print(result, "\n", duration)

power(42, 168)
