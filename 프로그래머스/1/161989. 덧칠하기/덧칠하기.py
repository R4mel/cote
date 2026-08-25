def solution(n, m, section):
    answer = 0
    painted = 0

    for x in section:
        if x >= painted:
            answer += 1
            painted = x + m

    return answer