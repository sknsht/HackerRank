for _ in range(int(input())):
    a, b = input().split()
    try:
        print(int(a) // int(b))
    except Exception as e:
        print('Error Code: ' + str(e))