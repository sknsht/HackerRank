import numpy as np

n, m = map(int, input().split())
a, b = (np.array([input().split() for _ in range(n)], dtype=int) for _ in range(2))
print(a + b, a - b, a * b, a // b, a % b, a ** b, sep='\n')