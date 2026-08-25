def solution(left, right):
    answer = 0
    def c(a):
        count = 0
        for i in range(1, int(a **0.5) + 1):
            if a % i == 0:
                count += 2
                if i * i == a:
                    count-=1
        return count
    for i in range(left, right + 1):
        if c(i) % 2 == 0:
            answer += i
        else:
            answer -= i
    return answer
    