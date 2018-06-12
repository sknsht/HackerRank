import numpy as np

np.set_printoptions(legacy='1.13')

n, m = map(int, input().split())
array = np.array([input().split() for _ in range(n)], int)
print(np.mean(array, axis=1), np.var(array, axis=0), np.std(array), sep = '\n')