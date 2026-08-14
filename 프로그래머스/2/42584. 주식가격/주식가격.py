from collections import deque
def solution(prices):
    queue = deque(enumerate(prices))
    answer = []
    # [1,2,3,2,3]
    # [4,3,1,1,0]
    while queue:
        now_idx, now_value = queue.popleft()
        count = 0
        for idx, value in queue:
            count += 1
            if now_value > value:
                break
        answer.append(count)
    return answer