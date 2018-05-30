if __name__ == '__main__':
    str = input()
    print(any(c.isalnum() for c in str))
    print(any(c.isalpha() for c in str))
    print(any(c.isdigit() for c in str))
    print(any(c.islower() for c in str))
    print(any(c.isupper() for c in str))

    # for test in ('isalnum', 'isalpha', 'isdigit', 'islower', 'isupper'):
    #    print(any(eval("c." + test + "()") for c in str))