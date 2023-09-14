string1 = " 42 "
string2 = " is "
string3 = " the answer "
concat = "The string " + "\"" + string1[1:] + string2[1:] + string3[1:][:len(string3) -2] + "\"" + " contains 16 characters."

print(concat)

# "The string \"42 is the answer\" contains 16 characters."