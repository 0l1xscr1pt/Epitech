import numpy as np
import matplotlib.pyplot as matplot

matplot.rc('axes', axisbelow=True)

def graph(x, y) :
    matplot.scatter(x, y, c='red')
    matplot.grid()
    matplot.show()
    return 0

graph([0, 1, 2, 3], [12, 32, 42, 52])