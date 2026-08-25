def solution(s):
    answer = 0
    x = ''
    x_count = 0
    other_count = 0

    for c in s:
        if x == '':
            x = c

        if c == x:
            x_count += 1
        else:
            other_count += 1

        if x_count == other_count:
            answer += 1
            x = ''
            x_count = 0
            other_count = 0

    if x_count != 0 or other_count != 0:
        answer += 1

    return answer