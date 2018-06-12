import numpy as np

poly = [float(x) for x in input().split()]
x = float(input())
print(np.polyval(poly, x))