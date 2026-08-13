def solution(a, b):
    sum = 0
    for v1, v2 in zip(a, b):
        sum += v1 * v2
    return sum