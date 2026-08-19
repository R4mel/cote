def solution(arr1, arr2):
    row_arr1 = len(arr1)
    col_arr1 = len(arr1[0])
    row_arr2 = len(arr2)
    col_arr2 = len(arr2[0])
    answer = [[0] * col_arr2 for _ in range(row_arr1)]
    for i in range(row_arr1):
        for j in range(col_arr2):
            for k in range(col_arr1):
                answer[i][j] += arr1[i][k] * arr2[k][j]
    return answer