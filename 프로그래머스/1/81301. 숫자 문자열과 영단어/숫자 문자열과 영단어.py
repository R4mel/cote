def solution(s):
    digit = ['zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight', 'nine']
    for i in range(len(digit)):
        s = s.replace(digit[i], str(i))
    return int(s)