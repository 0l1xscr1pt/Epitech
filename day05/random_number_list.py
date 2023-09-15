import random
import time

def randomNumber() :
    list = []
    index = ""

    startingTime = time.time()
    for i in range(1, 1000000) :
        a = random.randint(1, 1000000)
        list.append(a)
    list.sort()
    print(list)
    duration = time.time()- startingTime
    print(duration)
    
randomNumber()