from collections import OrderedDict

order = OrderedDict()
for _ in range(int(input())):
    item, space, price = input().rpartition(' ')
    order[item] = order.get(item, 0) + int(price)
for item, price in order.items():
    print(item, price)