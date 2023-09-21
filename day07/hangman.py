def nbr_of_underscore(string) :
    _hangman = ""
    for i in range(len(string)) :
        _hangman += "_"
    return _hangman


def testGoodCompletWord(string, wordToTest, points) :
    if (points <= 1) :
        print(f"{wordToTest.upper()} : correct guess \nCongratulations \n {points} point)")
    else :
        print(f"{wordToTest.upper()} : correct guess \nCongratulations \n {points} points)")
    return 0


def testNotGoodCompletWord(string, wordToTest, _hangman, points) :
    if (points <= 1) :
        print(f"{wordToTest.upper()} : incorrect guess \n{' '.join(_hangman)} \n - {points} point")
    else :
        print(f"{wordToTest.upper()} : incorrect guess \n{' '.join(_hangman)} \n - {points} points")
    return 0


def goodLetter(string, wordToTest, _hangman, points) :
    if (points <= 1) :
        print(f"Found one '{wordToTest}' \n{' '.join(_hangman)} / {points} point")
    else :
        print(f"Found one '{wordToTest}' \n{' '.join(_hangman)} / {points} points")
    return 0


def notGoodLetter(string, wordToTest, _hangman, points) :
    print(f'No ‘{wordToTest}’ found')
    if points <= 1 :
        print(f"{' '.join(_hangman)} / - {points} point")
    else :
        print(f"{' '.join(_hangman)} / - {points} points")
    return 0


def hangman(string) :
    _hangman = nbr_of_underscore(string)
    lettersStocked = ''.join(_hangman)
    points = 0
    wordToTest = ""


    if (len(wordToTest) == 0) :
        print(f"{' '.join(_hangman)} / {points} point")

        while (lettersStocked != string) :
            wordToTest = input()

            if wordToTest == '' :
                print(f"{' '.join(_hangman)} / {points} point")
                continue

            #test for word 
            if len(wordToTest) > 1 :
                lettersStocked = wordToTest
                if (string == wordToTest) :
                    testGoodCompletWord(string, wordToTest, points)
                else :
                    points += 1
                    testNotGoodCompletWord(string, wordToTest, _hangman, points)

            else :
                #test for letters 
                if wordToTest in string :
                    index = string.index(wordToTest)
                    _hangman = list(_hangman)
                    _hangman[index] = wordToTest
                    lettersStocked = ''.join(_hangman)
                    goodLetter(string, wordToTest, _hangman, points)
                else :
                    points += 1
                    notGoodLetter(string, wordToTest, _hangman, points)
        return 0

                
hangman("word")