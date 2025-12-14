n = int(input())
result = 0

for i in range(1, n+1):
    l = list(map(int, str(i)))
    result = sum(l) + i
    if result == n:
        print(i)
        break
    if i == n:
        print(0)