import numpy as np

np.set_printoptions(sign=' ')

a = np.array(input().split(), float)
print(*(f(a) for f in [np.floor, np.ceil, np.rint]), sep='\n')