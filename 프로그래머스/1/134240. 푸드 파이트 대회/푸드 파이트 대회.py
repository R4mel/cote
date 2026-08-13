def solution(food):
    res = []
    for i in range(1, len(food)):
        for j in range(food[i] // 2):
            res.append(str(i))    
    res.append('0')
    for i in range(len(food) - 1, -1, -1):
        for j in range(food[i] // 2):
            res.append(str(i))
    return ''.join(res)
    