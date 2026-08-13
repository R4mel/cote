def solution(s, n):
    res = []
    for i in s:
        if i.isupper():
            res.append(chr((ord(i) - ord('A') + n) % 26 + ord('A')))
        elif i.islower():
            res.append(chr((ord(i) - ord('a') + n) % 26 + ord('a')))
        else:
            res.append(' ')
    return ''.join(res)
    
            