def solution(n):
    next = n
    while True:
        next += 1
        if bin(n)[2:].count('1') == bin(next)[2:].count('1'):
            return next