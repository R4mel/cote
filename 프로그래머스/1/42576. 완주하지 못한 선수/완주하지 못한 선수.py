from collections import Counter
def solution(participant, completion):
    p = Counter(participant)
    c = Counter(completion)
    
    return ''.join((p-c).keys())
