from re import match, compile

pattern = compile('^[-+]?[0-9]*\.[0-9]+$')
for _ in range(int(input())):
    print(bool(pattern.match(input())))