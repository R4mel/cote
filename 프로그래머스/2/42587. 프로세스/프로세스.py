from collections import deque
def solution(priorities, location):
    queue = deque([(i, p) for i, p in enumerate(priorities)])
    answer = 0
    
    while queue:
        now = queue.popleft()
        hasHigher = False
        for idx, pri in queue:
            if pri > now[1]:
                hasHigher = True
                break
        if hasHigher:
            queue.append(now)
        else:
            answer += 1
            if now[0] == location:
                return answer