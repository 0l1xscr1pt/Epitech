import numpy as np
import matplotlib.pyplot as matplot
import math

def new_x(x) :
    return x**2 + x *3 + 2

new_x(12)

def plot_fct(function_y_values, _min, _max) :
    x_values = []
    y_values = []
    for i in range(_min, _max + 1) :
        if i != 0 :
            x_values.append(i)
            y_values.append(function_y_values(i))
    matplot.plot(x_values, y_values, c='red')
    matplot.grid()
    matplot.show()
    return 0

plot_fct(math.sin , 0 , 50)
plot_fct(new_x, -100 , 200)
plot_fct(lambda x : x **2 , -10 , 10)
plot_fct(lambda x : 1 / x , -100 , 100)

