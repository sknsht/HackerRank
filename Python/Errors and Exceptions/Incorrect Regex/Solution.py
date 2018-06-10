import re

for _ in range(int(input())):
    try:
        re.compile(input())
        print(True)
    except Exception as e:
        print(False)