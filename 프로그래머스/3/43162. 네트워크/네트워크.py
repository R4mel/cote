def solution(n, computers):
    def dfs(i):
        visited[i] = True
        
        for j in range(n):
            if not visited[j] and computers[j][i]:
                dfs(j)
    
    visited = [False] * n
    cnt = 0
            
    for i in range(n):
        if not visited[i]:
            cnt += 1
            dfs(i)
        
    return cnt