def solution(brown, yellow):
    total = brown + yellow
    # total = 12
    # brown = 10
    # yellow = 2 -> (width-2) * (height-2)
    # width = 4 height = 3
    for h in range(3, total):
        for w in range(h, total // h+1):
            if (w-2) * (h-2) == yellow:
                return [w, h]