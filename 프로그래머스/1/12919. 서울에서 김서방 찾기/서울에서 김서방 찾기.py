def solution(seoul):
    ll = []
    for i, v in enumerate(seoul):
        if 'Kim' == v:
            return "김서방은 " + str(i) + "에 있다"