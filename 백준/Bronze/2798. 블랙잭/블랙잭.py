from itertools import combinations

n, m = map(int, input().split())
l = list(map(int, input().split()))

result_l = list(combinations(l, 3))

ans = 0
for i in result_l:
    summ = sum(i)
    if summ <= m and summ > ans:
        ans = summ

print(ans)
