import string


def print_rangoli(size):
    alpha = string.ascii_lowercase
    for i in range(n - 1, 0, -1):
        row = ["-"] * (n * 2 - 1)
        for j in range(0, n - i):
            row[n - 1 - j] = alpha[j + i]
            row[n - 1 + j] = alpha[j + i]
        print("-".join(row))

    for i in range(0, n):
        row = ["-"] * (n * 2 - 1)
        for j in range(0, n - i):
            row[n - 1 - j] = alpha[j + i]
            row[n - 1 + j] = alpha[j + i]
        print("-".join(row))


if __name__ == '__main__':
    n = int(input())
    print_rangoli(n)
