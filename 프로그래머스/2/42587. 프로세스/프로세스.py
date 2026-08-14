from collections import deque
def solution(priorities, location):
    queue = deque(enumerate(priorities))
    # [A, B, C, D]
    # [2, 1, 3, 2]
    # [C, D, A, B]
    count = 0
    while queue:
        hasHigher = False
        idx, now_priority = queue.popleft()
        
        for _, priority in queue:
            if now_priority < priority:
                hasHigher = True
                break
        if hasHigher:
            queue.append((idx, now_priority))
        else:
            count += 1
            if idx == location:
                return count
        
        