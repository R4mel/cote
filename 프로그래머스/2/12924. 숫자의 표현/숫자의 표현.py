def solution(n):
    answer = 0
    for i in range(1, n+1):
        summ = 0
        for j in range(i, n+1):
            summ += j
            if summ == n:
                answer +=1 
                break
            if summ > n:
                break
    
    
    return answer