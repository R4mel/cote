def solution(t, pp):
    arr = []
    p = len(pp)
    for i in range(len(t) - p + 1):
        arr.append(t[i: i + p])
    
    count = 0
    res = map(int, arr)
    for r in res:
        if int(pp) >= r:
            count += 1
    return count