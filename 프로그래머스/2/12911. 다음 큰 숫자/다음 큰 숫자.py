def solution(n):
    answer = 0
    count = 1
    while True:
        if bin(n)[2:].count('1') == bin(n+count)[2:].count('1'):
            return n+count
        count += 1
    
    return answer