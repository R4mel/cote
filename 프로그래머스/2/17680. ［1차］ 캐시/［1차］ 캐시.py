from collections import deque
def solution(cacheSize, cities):
    answer = 0
    queue = deque()
    
    for city in cities:
        city = city.lower()
        
        if city in queue:
            answer += 1
            queue.remove(city)
            queue.append(city)
        else:
            answer += 5
            
            if cacheSize > 0:
                if len(queue) == cacheSize:
                    queue.popleft()
                queue.append(city)
    return answer