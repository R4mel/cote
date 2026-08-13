def solution(s):
    res = []
    index = 0
    for i in range(len(s)):
        if s[i] == ' ':
            res.append(s[i])
            index = 0
        elif index % 2 == 0:
            res.append(s[i].upper())
            index += 1
        elif index % 2 == 1:
            res.append(s[i].lower())
            index += 1
    return ''.join(res)