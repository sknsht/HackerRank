import re

n, m = map(int, input().split())
a, b = [], ''
for _ in range(n):
    a.append(input())

for z in zip(*a):
    b += ''.join(z)

print(re.sub(r'(?<=\w)([^\w]+)(?=\w)', ' ', b))