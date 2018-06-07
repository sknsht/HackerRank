import math

ab = float(input())
bc = float(input())

print(str(int(round(math.degrees(math.atan2(ab, bc))))) + '°')