import matplotlib.pyplot as plt
import math
import numpy
y = []
x = numpy.arange(-5,5,0.1)
for i in x:
	val = 1/(1+math.exp(-i))
	val = val * (1 - val)
	y.append(val)
print "input value = ", x
plt.plot(y)
plt.show()

