def solution(numbers, target):
    answer = 0
    def dfs(index, total):
        if index == len(numbers):
            if total == target:
                return 1
            else:
                return 0
        a = dfs(index+1, total+numbers[index])
        b = dfs(index+1, total-numbers[index])
        return a+b 
    return dfs(0,0)