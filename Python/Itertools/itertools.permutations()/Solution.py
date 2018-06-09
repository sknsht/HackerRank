import itertools

string, permutation_size = input().split()
for permutation in itertools.permutations(sorted(string), int(permutation_size)):
    print(''.join(permutation))