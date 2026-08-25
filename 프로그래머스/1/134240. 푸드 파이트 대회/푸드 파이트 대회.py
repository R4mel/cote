def solution(food):
    res = []
    for i in range(1, len(food)):
        for j in range(food[i] // 2):
            res.append(str(i))    
    tmp = ''.join(res[::-1])
    res.append('0')
    res.append(tmp)
    return ''.join(res)
    