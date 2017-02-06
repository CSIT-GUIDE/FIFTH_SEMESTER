import matplotlib.pyplot as plt
import numpy
import math
y = []
x = numpy.arange(-5,5,0.1)
for i in x:
	val = ((1-i**2)*math.exp(-i**2/2))
	y.append(val)
plt.plot(y)
plt.show()
