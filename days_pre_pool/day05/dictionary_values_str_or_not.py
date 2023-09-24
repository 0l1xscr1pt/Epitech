student = {
    'name' : 'uuuu',
    'academic_year' : 1
}

for i, j in student.items():
    print(i, j)
    if (type(j) == str) :
        print("type == str", j)
    else :
        print("not str", j)