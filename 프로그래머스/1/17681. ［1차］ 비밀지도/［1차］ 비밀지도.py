def solution(n, arr1, arr2):
    answer = []
    
    for a,b in zip(arr1,arr2):
        tmp = []
        a = bin(a)[2:].zfill(n)
        b = bin(b)[2:].zfill(n)
        
        for i in range(n):
            if a[i] == '1' or b[i] == '1':
                tmp.append('#')
            else:
                tmp.append(' ')
        answer.append(''.join(tmp))
    return answer