def solution(d, budget):
    answer = 0
    for i in sorted(d):
        if budget >= i:
            answer += 1
            budget -= i
    
    return answer