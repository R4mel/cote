def solution(s):
    answer = []
    last_seen = {}
    for idx, char in enumerate(s):
        if char in last_seen:
            answer.append(idx - last_seen[char])
        else:
            answer.append(-1)
            
        last_seen[char] = idx
    return answer