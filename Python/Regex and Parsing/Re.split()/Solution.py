import re

regex_pattern = r'[.,]+'

print('\n'.join(re.split(regex_pattern, input())))