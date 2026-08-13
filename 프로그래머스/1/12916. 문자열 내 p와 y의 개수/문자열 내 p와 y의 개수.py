def solution(s):
    p_count = 0
    y_count = 0
    for i in list(s):
        if i.lower() == 'p':
            p_count += 1
        elif i.lower() == 'y':
            y_count += 1
    return p_count == y_count