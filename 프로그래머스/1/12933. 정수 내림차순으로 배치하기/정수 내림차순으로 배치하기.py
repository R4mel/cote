def solution(n):
    a = sorted(str(n), reverse = True)
    return int(''.join(a))