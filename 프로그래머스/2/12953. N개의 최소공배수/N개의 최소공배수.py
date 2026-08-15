import math
def solution(arr):
    arr.sort()
    res = [arr[0]]
    resIndex = 0
    for i in range(1, len(arr)):
        res.append(math.lcm(res[resIndex], arr[i]))
        resIndex += 1
    return res[-1]