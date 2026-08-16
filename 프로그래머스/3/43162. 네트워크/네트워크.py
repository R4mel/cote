def solution(n, computers):
    count = 0
    visited = [False] * n
    
    def dfs(node):
        visited[node] = True
        
        for nei in range(n):
            if not visited[nei] and computers[node][nei]:
                dfs(nei)
                
    for start in range(n):
        if not visited[start]:
            count += 1
            dfs(start)
        
    return count