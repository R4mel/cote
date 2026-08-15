from collections import Counter
def solution(want, number, discount):
    answer = 0
    for i in range(len(discount) - 10 + 1):
        d = dict(zip(want, number))
        sale_d = Counter(discount[i:i+10])
        
        if d == sale_d:
            answer += 1
            
    return answer
            