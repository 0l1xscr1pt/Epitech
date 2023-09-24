# def palindrome(string) :

#   if (len(string) <= 1):  # si le mot est vide ou n'a qu'un seul caractère, c'est un palindrome
#       print(True)
#       return True
  
#   # vérifier si le premier et le dernier caractère sont les mêmes.
#   if (string[0] == string[-1]):   # S'ils le sont, supprimez le premier et le dernier caractère et vérifiez le mot restant de manière récursive.
#       return palindrome(string[1:-1])
#   else:
#     print(False)
#     return False   # Si ce n'est pas le cas, le mot n'est pas un palindrome.
# palindrome("kayak")


def palindrome(string) :

  if (len(string) > 0):   # S'ils le sont, supprimez le premier et le dernier caractère et vérifiez le mot restant de manière récursive.
      return palindrome(string[1])

palindrome("kayak")


# Write a recursive function that tests if a string is a palindrome, such as “kayak”, “never odd or even”
# or “Was it a car or a cat I saw?”.