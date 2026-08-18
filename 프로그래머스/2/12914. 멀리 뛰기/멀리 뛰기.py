def solution(n):
    arr = [0,1]
    # 0 1 1 2 3 5
    for i in range(2,n+2):
        arr.append((arr[i-1]+arr[i-2])%1234567)
    return arr[-1]