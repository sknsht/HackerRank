from itertools import groupby

for key, group in groupby(input()):
    print((len(list(group)), int(key)), end=' ')