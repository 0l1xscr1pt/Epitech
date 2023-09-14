def inputInteger(number) :
    number = int(number)
    if (number == 42 or number <= 21 or (number % 2) == 1 or (number / 2) < 21 or ((number % 2) == 0 and number >= 45)) :
        print("OK")
    else :
        print("You got wrong my poor friend!")
    return 0

inputInteger(input())