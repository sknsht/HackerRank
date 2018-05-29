input()
array = map(int, input().split())
print(sorted(list(set(array)))[-2])