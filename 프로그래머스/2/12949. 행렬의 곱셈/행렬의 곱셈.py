def solution(A, B):
    row_A = len(A)
    col_A = len(A[0])
    col_B = len(B[0])
    result = [[0] * col_B for _ in range(row_A)]
    
    # 2. 3중 for 문으로 행렬 곱셈 계산
    for i in range(row_A):          # A의 행 이동
        for j in range(col_B):      # B의 열 이동
            for k in range(col_A):  # A의 열(B의 행) 매칭 연산
                result[i][j] += A[i][k] * B[k][j]
                
    return result