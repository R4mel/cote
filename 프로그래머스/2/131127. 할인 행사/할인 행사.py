def solution(want, number, discount):
    answer = 0
    for i in range(len(discount) - 10 + 1):
        d = dict(zip(want, number))
        tmp = discount[i:i+10]
        
        for item in tmp:
            if item in d:
                d[item] -= 1
        
        isZero = True
        
        for value in d.values():
            if value != 0:
                isZero = False
                break
                
        if isZero:
            answer += 1
            
    return answer
            