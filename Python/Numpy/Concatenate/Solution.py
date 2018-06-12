import numpy as np

a, b, c = map(int, input().split())
A = np.array([input().split() for _ in range(a)], int)
B = np.array([input().split() for _ in range(b)], int)
print(np.concatenate((A, B), axis=0))