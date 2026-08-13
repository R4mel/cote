def solution(s):
    res = list(s)
    res.sort(reverse = True)
    return ''.join(res)