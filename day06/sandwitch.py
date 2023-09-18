
def sandwitch() :
    print (" bread \n lettuce \n tomato \n tomato \n ham \n bread \n")

def vegetableSandwitch() :
    print (" bread \n lettuce \n lettuce \n tomato \n tomato \n bread \n")

def loop(n, vegan) :
    if n > 0 :
        if vegan > 0 :
            for i in range(vegan) :
                vegetableSandwitch()
        else :
            print("no vegetable sandwitchs")
        for i in range(n) :
            sandwitch()
    else :
        print("Je ne peux pas faire ça")
loop(2, 1)