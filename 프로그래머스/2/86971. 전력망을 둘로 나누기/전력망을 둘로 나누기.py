def solution(n, wires):
    answer = n

    for cut in wires:
        graph = [[] for _ in range(n + 1)]

        # 그래프 생성
        # 단, 현재 끊을 전선은 제외
        for a, b in wires:
            if [a, b] == cut:
                continue

            graph[a].append(b)
            graph[b].append(a)

        # DFS
        visited = [False] * (n + 1)

        def dfs(node):
            visited[node] = True
            count = 1

            for next_node in graph[node]:
                if not visited[next_node]:
                    count += dfs(next_node)

            return count

        group1 = dfs(1)
        group2 = n - group1

        answer = min(answer, abs(group1 - group2))

    return answer