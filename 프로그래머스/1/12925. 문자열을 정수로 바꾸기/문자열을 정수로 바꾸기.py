def solution(s):
    if s.startswith('-'):
        return int(s[1:]) * -1
    else:
        return int(s)