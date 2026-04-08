def solution(arr, idx):
    for i in range(len(arr)):
        if arr[i] == 1 and i >= idx:
            return i
    return -1
