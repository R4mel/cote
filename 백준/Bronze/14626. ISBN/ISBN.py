import sys
input = sys.stdin.readline

isbn = input().strip()

total = 0
weight = [1 if i % 2 == 0 else 3 for i in range(12)]
star = isbn.index('*')

for i in range(12):
    if i == star:
        continue
    total += int(isbn[i]) * weight[i]

for i in range(10):
    tmp = i * weight[star] + total
    m = int(isbn[-1])
    if (tmp + m) % 10 == 0:
        print(i)
