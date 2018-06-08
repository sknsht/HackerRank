import itertools

A = [int(x) for x in input().split()]
B = [int(y) for y in input().split()]

print(*itertools.product(A, B))