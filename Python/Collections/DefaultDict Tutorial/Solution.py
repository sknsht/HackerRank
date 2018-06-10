from collections import defaultdict

d = defaultdict(list)
n, m = map(int, input().split())

for i in range(n):
    d[input()].append(str(i + 1))
for j in range(m):
    print(' '.join(d[input()]) or -1)