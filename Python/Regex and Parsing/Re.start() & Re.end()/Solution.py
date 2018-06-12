import re

string = input()
substring = input()

pattern = re.compile(substring)
match = pattern.search(string)
if not match: print('(-1, -1)')
while match:
    print('({0}, {1})'.format(match.start(), match.end() - 1))
    match = pattern.search(string, match.start() + 1)