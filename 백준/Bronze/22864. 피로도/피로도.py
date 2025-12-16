a,b,c,m = map(int, input().split())

p = 0 # 피로도
result = 0 # 일한 양

for _ in range(24):
    if m < a or p > m:
        break
    else:
        if p + a <= m:
            p += a
            result += b
        else:
            if p - c >= 0:
                p -= c
            else:
                p = 0

print(result)

"""
a: 한시간 일할 때 쌓이는 피로도
b: 한시간 일할 때 처리량
c: 한시간 쉴 때 빠지는 피로도
m: 상한 피로도
"""
