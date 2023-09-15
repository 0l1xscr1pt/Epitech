def sum(javaCredit, networkCredit, webCredit) :
    sumResult = javaCredit + networkCredit + webCredit
    print(sumResult)
    return 0

def gpa(javaGrad, networkGrad, webGrad) :
    print(javaGrad, networkGrad, webGrad)
    return 0


def createDictionnary(java, network, web) :
    student = {
        'name' : 'uuuu',
        'academic_year' : 1,
        'units' : [
            {'name': 'Java','credits': java[0], 'grade': java[1]},
            {'name': 'Network and System Administration','credits': network[0], 'grade': network[1]},
            {'name': 'Web Development','credits': web[0], 'grade': web[1]}
            ],
    }

    grade_weight_mapping = {
        'A' : 4,
        'B' : 3,
        'C' : 2,
        'D' : 1,
        'E' : 0
    }

    totalCredit = result(student['units'][0]['credits'], student['units'][1]['credits'], student['units'][2]['credits'])

    # print(student['units'][0]['credits'], student['units'][0]['grade'])
    return 0

createDictionnary((10, 'A'), (10, 'A'), (10, 'B'))



    # student['gpa'] = sum(grade_weight_mapping[unit['grade']] * unit['credits'] for unit in student['units']) // student['total_credits']










#total credit -> donner valeur correcte selon le nombre de crédits
#que vous avez accordés à chaque unité dans la tâche précédente.
#Ajoutez également une clé GPA et donnez-lui la valeur correcte.
#GPA ou Grade Point Average est un nombre compris entre 0 et 4.
#C'est la note moyenne obtenue, pondéré par le nombre de crédits.



# print(student['units'][0]['name'])

# for i, j in student.items():
#     # print(i, j)
#     if (type(j) == str) :
#         print("it's string")
#     else :
#         print("NOT a string")
