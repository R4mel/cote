def solution(numbers):
    res = []
    for i in range(len(numbers)):
        for j in range(len(numbers)):
            if i != j and numbers[i] + numbers[j] not in res:
                res.append(numbers[i] + numbers[j])
    return sorted(res)