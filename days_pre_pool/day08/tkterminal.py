from tkinter import *
from tkinter import ttk

root = Tk()
root.title('Terminal')
root.geometry("500x500")


def _print():
    myEntry = my_entry.get()
    my_entry.delete(0,END)
    my_entry.insert(0, myEntry.upper())


bouton=Button(root, text = "Afficher", command = _print)
bouton.pack(side = TOP)
 
my_entry = Entry()
my_entry.pack()

root.mainloop()