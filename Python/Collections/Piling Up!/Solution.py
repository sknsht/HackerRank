for t in range(int(input())):
    l = int(input())
    sides = list(map(int, input().split()))
    i = 0
    while i < l - 1 and sides[i] >= sides[i + 1]:
        i += 1
    while i < l - 1 and sides[i] <= sides[i + 1]:
        i += 1
    print('Yes' if i == l - 1 else 'No')