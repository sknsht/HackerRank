import re

pattern = re.compile(
    r'^'
    r'(?!.*(\d)(-?\1){3})'
    r'[456]\d{3}'
    r'(?:-?\d{4}){3}'
    r'$')
for _ in range(int(input().strip())):
    print('Valid' if pattern.search(input().strip()) else 'Invalid')