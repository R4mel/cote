def solution(x, n):
    answer = []
    count = 0
    while count < n:
        answer.append(x + count * x)
        count += 1
    return answer