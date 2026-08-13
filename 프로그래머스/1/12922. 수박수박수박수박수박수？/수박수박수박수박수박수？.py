def solution(n):
    arr = []
    while n:
        if len(arr) % 2 == 0:
            arr.append('수')
        else:
            arr.append('박')
        n -= 1
    return ''.join(arr)