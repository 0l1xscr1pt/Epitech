import re

def generate_hashtag(string):
    i = 0
    while i < len(string) :
        if string[i] == 

    return


generate_hashtag(" Hello there thanks for trying my Kata") #   "#HelloThereThanksForTryingMyKata"
generate_hashtag("    Hello     World   ") #   "#HelloWorld"
generate_hashtag("")   #    false


    # It must start with a hashtag (#).
    # All words must have their first letter capitalized.
    # If the final result is longer than 140 chars it must return false.
    # If the input or the result is an empty string it must return false.