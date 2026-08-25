def solution(s):
    zero = 0
    count = 0
    while s != '1':
        zero += s.count('0')
        s = bin(len(s.replace('0','')))[2:]
        count+=1
    return [count, zero]