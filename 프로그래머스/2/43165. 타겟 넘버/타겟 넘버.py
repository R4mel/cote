def solution(numbers, target):
    answer = 0
    def dfs(index, cur):
        nonlocal answer
        if index == len(numbers):
            if cur == target:
                answer += 1
            return
        dfs(index+1, cur+numbers[index])
        dfs(index+1, cur-numbers[index])
    dfs(0, 0)
    return answer