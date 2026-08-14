def solution(brown, yellow):
    answer = []
    total = brown + yellow # width * height
    # yellow = (width - 2) * (height - 2)
    for height in range(3, total + 1):
        if total % height == 0:
            width = total // height
            if (width - 2) * (height - 2) == yellow:
                return [width, height]
    return answer