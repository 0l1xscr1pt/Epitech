import os

def mylistdirectory(path) :

    test = os.path.dirname(path) #nom du directory
    print(test)

    test2 = os.listdir(path) #contenu du dossier
    print(test2)

    #boucle for pour afficher le contenu du dossier + son chemin
    #isdir pour voir si c'est un dossier
    #si true, c'est un fichier
    #si dossier mettre à jour chemin
    
mylistdirectory("/home/kali/epitech/pythonPrePool/day06")



#Écrivez un programme qui répertorie tous les fichiers et répertoires des répertoires actuels, 
#ainsi que tous les fichiers et répertoires dans ses sous-répertoires et ainsi de suite.


# Write a program that lists all the files and directories in the current directories, as well as all files
# and directories in its sub-directories and so on.
# It should behave similarly as the ls -R command.
# os.listdir(), 