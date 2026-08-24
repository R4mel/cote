def solution(sizes):
    w = [] # 더 큰거
    h = []
    for i,j in sizes:
        w.append(max(i, j))
        h.append(min(i, j))
    return max(w) * max(h)