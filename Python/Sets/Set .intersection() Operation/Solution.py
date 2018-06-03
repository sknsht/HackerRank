_, en_subscribers = input(), set(map(int, input().split())) 
_, fr_subscribers = input(), set(map(int, input().split())) 
print(len(en_subscribers.intersection(fr_subscribers)))