t = int(input())

for _ in range(t):
    k = int(input())
    n = int(input())
    l = [i for i in range(1, n+1)]
    
    for x in range(k):
        for y in range(1, n):
            l[y] += l[y-1]
    print(l[-1])

