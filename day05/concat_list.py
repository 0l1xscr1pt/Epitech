
my_first_list = [4 , 5 , 6]
my_second_list = [1 , 2 , 3]
my_first_list.extend(my_second_list)
print(my_first_list)


list = [7 , 8 , 9]
list2 = [4 , 5 , 6]
list = [* list , * list2]
print(list)