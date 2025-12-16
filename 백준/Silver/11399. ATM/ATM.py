n = int(input())
p = list(map(int, input().split()))

p.sort()

result = p[0]
for i in range(1, len(p)):
    p[i] += p[i-1]

print(sum(p))
