from collections import Counter
def solution(topping):
    answer = 0
    right = Counter(topping)
    left = set()
    
    for i in topping:
        right[i] -= 1
        left.add(i)
        
        if right[i] == 0:
            del right[i]
        
        if len(left) == len(right):
            answer += 1
    return answer





