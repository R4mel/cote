from collections import deque
import math
def solution(progresses, speeds):
    answer = []
    queue = deque()
    for p, s in zip(progresses, speeds):
        days = math.ceil((100-p) / s)
        queue.append(days)

    while queue:
        now = queue.popleft()
        count = 1
        while queue and now >= queue[0]:
            queue.popleft()
            count += 1
        answer.append(count)
    return answer