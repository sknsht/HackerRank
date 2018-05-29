grade_sheet = []
for _ in range(int(input())):
    name = input()
    score = float(input())
    grade_sheet.append([name, score])

second_lowest = sorted(list(set([grades for name, grades in grade_sheet])))[1]
print('\n'.join([a for a, b in sorted(grade_sheet) if b == second_lowest]))