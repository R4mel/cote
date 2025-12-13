n = int(input())
l = list(map(int, input().split()))
t, p = map(int, input().split())

total_t = 0

for count in l:
    if count % t == 0:
        total_t += count // t
    elif count < t:
        total_t += 1
    else:
        total_t += (count // t) + 1

print(total_t)
print(n // p, n % p)
