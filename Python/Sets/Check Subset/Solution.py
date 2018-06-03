for _ in range(int(input())):
    a, A = input(), set(input().split())
    b, B = input(), set(input().split())

    print(A.issubset(B))