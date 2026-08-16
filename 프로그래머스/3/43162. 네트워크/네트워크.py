def solution(n, computers):
    count = 0
    visited = set()
    
    def dfs(node):
        visited.add(node)
        
        for nei in range(n):
            if nei not in visited and computers[node][nei]:
                dfs(nei)
    
    for start in range(n):
        if start not in visited:
            dfs(start)
            count += 1
    return count
