from collections import Counter
def solution(participant, completion):
    p = Counter(participant)
    c = Counter(completion)
    
    result = ''.join((p-c).keys())
    return result
