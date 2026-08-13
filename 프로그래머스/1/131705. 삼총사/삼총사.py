from itertools import combinations
def solution(number):
    answer = 0
    
    for triple in combinations(number, 3):
        if sum(triple) == 0:
            answer += 1
    return answer