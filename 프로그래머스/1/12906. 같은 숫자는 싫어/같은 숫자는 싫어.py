def solution(arr):
    answer = []
    for a in arr:
        if len(answer) == 0:
            answer.append(a)
        elif len(answer) > 0 and answer[-1] != a:
            answer.append(a)
    return answer