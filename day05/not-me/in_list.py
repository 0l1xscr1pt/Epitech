print([x + 10 for x in [3, 2, 6, 7, 1, 4]])


print(list(map(lambda x: x * x, [3, 2, 6, 7, 1, 4])))


print(list(filter(lambda x: x > 10, [42, 3, 4, 18, 3, 10])))


print([*enumerate([42, 3, 4, 18, 3, 10])])


first_name = [ " Jackie " , " Bruce " , " Arnold " , " Sylvester " ]
last_name = [ " Stallone " , " Schwarzenegger " , " Willis " , " Chan " ]
magic = [* zip ( first_name , last_name [:: -1]) ]
print(magic)