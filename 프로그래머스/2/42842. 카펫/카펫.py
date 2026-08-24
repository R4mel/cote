def solution(brown, yellow):
    answer = []
    total = brown + yellow
    '''
    total = 12
    w = 4
    h = 3
    yellow = 2 -> (w-2) * (h-2)
    '''
    for h in range(3, total):
        for w in range(h, total // h+1):
            if (w-2)*(h-2) == yellow:
                return [w,h]