def solution(elements):
    answer = set()
    n = len(elements)
    elements = elements * 2
    
    for j in range(n):
        current_sum = 0
        for length in range(1, n+1):
            current_sum += elements[j+length-1]
            answer.add(current_sum)
    
    return len(answer)