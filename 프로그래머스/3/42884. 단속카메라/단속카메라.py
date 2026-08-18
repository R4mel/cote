def solution(routes):
    answer = 0
    routes.sort(key=lambda x:x[1])
    camera = -300001
    for start, end in routes:
        if start > camera:
            camera = end
            answer += 1
    
    return answer