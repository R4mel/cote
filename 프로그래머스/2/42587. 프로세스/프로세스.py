from collections import deque
def solution(priorities, location):
    answer = 0
    queue = deque(enumerate(priorities))
    
    while queue:
        now = queue.popleft()
        hasHigher = False
        for q in queue:
            if q[1] > now[1]:
                queue.append(now)
                hasHigher = True
                break
        if not hasHigher:
            answer += 1
            if now[0] == location:
                return answer 
                
    return answer