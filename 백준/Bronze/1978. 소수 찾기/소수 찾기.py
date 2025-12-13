import math

n = int(input())
data = list(map(int, input().split()))
count = 0

for d in data:
    if d < 2:
        continue
    
    is_prime = True
    limit = int(math.sqrt(d))
    
    for i in range(2, limit + 1):
        if d % i == 0:
            is_prime = False
            break
    
    if is_prime:
        count += 1

print(count)
