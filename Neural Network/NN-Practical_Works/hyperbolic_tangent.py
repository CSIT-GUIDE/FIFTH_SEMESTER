import matplotlib.pyplot as plt
import math
import numpy
y = []
x = numpy.arange(-5,5,0.1)
for i in x:
	val = (math.exp(i)-math.exp(-i))/(math.exp(i)+math.exp(-i))
	y.append(val)
print "input value = ", x
plt.plot(y)
plt.show()
