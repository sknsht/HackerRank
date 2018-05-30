def capitalize(string):
    full_name = string.split(' ')
    return ' '.join((word.capitalize() for word in full_name))


if __name__ == '__main__':
    string = input()
    capitalized_string = capitalize(string)
    print(capitalized_string)