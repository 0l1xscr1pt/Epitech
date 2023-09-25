import random
import sys
from hangman import hangman



if len(sys.argv) == 2 :
    _file = open(sys.argv[1])
    lines = _file.read().splitlines()
    myWord = random.choice(lines)
    # print(myWord)
    _file.close()
    hangman(myWord)
elif len(sys.argv) > 2 :
    print("number of arguments superior to 2")
else :
    print("missing arguments")


