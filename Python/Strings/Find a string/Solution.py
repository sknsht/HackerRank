import re


def count_substring(string, sub_string):
    match = re.findall('(?=' + sub_string + ')', string)
    return len(match)


if __name__ == '__main__':
    string = input().strip()
    sub_string = input().strip()

    count = count_substring(string, sub_string)
    print(count)