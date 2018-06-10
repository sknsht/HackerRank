from collections import OrderedDict

dict = OrderedDict()

for _ in range(int(input())):
    key = input()
    dict[key] = dict.get(key, 0) + 1

print(len(dict))
print(*dict.values())