def solution(a, b):
    answer = ''
    days = [31,29,31,30,31,30,31,31,30,31,30,31]
    day = dict(enumerate(days, start=1))
    count = 0
    month = 1
    while month < a:
        count += days[month-1]
        month += 1
    count += b
    name = ['FRI','SAT','SUN','MON','TUE','WED','THU']
    return name[(count-1) % len(name)]
