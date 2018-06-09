import itertools

string, combination_size = input().split()
for combination in itertools.combinations_with_replacement(sorted(string), int(combination_size)):
    print(''.join(combination))