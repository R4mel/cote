def solution(k, dungeons):
    answer = 0
    visited = [False] * len(dungeons)
    
    def dfs(k, count, visited):
        nonlocal answer
        answer = max(answer, count)
        for i in range(len(dungeons)):
            if not visited[i] and k >= dungeons[i][0]:
                visited[i] = True
                
                dfs(k-dungeons[i][1], count+1, visited)
                
                visited[i] = False
    dfs(k, 0, visited)
    
    return answer