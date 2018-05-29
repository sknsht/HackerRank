array = []
for _ in range(int(input())):
    command = input().strip().split(" ")
    cmd_type = command[0]
    if (cmd_type == "print"):
        print(array)
    elif (cmd_type == "sort"):
        array.sort()
    elif (cmd_type == "reverse"):
        array.reverse()
    elif (cmd_type == "pop"):
        array.pop()
    elif (cmd_type == "remove"):
        array.remove(int(command[1]))
    elif (cmd_type == "append"):
        array.append(int(command[1]))
    elif (cmd_type == "insert"):
        array.insert(int(command[1]), int(command[2]))