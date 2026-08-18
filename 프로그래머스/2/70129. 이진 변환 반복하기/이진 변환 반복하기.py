def solution(s):
    count = 0
    zero = 0
    while s != '1':
        for i in s:
            if i == '0':
                zero += 1
        s = s.replace('0', '')
        c = len(s)
        s = bin(c)[2:]
        count += 1
    return [count, zero]