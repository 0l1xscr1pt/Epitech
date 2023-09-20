from tkinter import *
from PIL import Image,ImageTk

root = Tk()
root.title('Terminal')
root.geometry("500x500")

monCanvas = Canvas(root, width=500, height=500, bg='ivory')

# img= Image.PhotoImage(Image.open("parrot.png"))
# canvas.create_image(10,10,anchor=NW,image=img)


img = ImageTk.PhotoImage(Image.open("/home/kali/epitech/pythonPrePool/day08/parrot.png"))

monCanvas.create_image(10, 10, anchor = NW, image = img)




monCanvas.pack()
root.mainloop()