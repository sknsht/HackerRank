import itertools

string, combination_size = input().split()
for length in range(1, int(combination_size) + 1):
    for combination in itertools.combinations(sorted(string), length):
        print(''.join(combination))