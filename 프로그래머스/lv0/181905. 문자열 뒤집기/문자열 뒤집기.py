def solution(my_string, s, e):
    return my_string[0:s] + ''.join(reversed(my_string[s:e + 1])) + my_string[e + 1:]