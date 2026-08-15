def solution(elements):
    result = set()
    elementLen = len(elements)
    # [7, 9, 1, 1, 4, 7, 9, 1, 1, 4]
    elements = elements * 2
    
    for i in range(elementLen): # 0 ~ 4
        for j in range(elementLen): # 0 ~ 4
            result.add(sum(elements[j:j+i+1]))
    return len(result)