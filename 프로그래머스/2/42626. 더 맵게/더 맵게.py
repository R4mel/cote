import heapq
def solution(s, k):
    answer = 0
    heapq.heapify(s)
    
    while s[0] < k:
        if len(s) < 2:
            return -1
        
        first = heapq.heappop(s)
        second = heapq.heappop(s)
        new_val = first + (second * 2)
        heapq.heappush(s, new_val)
        answer += 1
        
    return answer