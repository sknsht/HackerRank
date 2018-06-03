K = int(input())

room_list = list(map(int, input().split()))
room_set = set(room_list)
sum_room_list = sum(room_list)
sum_room_set = sum(room_set)
diff = sum_room_set * K - sum_room_list

print(diff // (K - 1))