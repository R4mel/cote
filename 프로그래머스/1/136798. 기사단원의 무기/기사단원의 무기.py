def solution(number, limit, power):
    def divisor_count(n):
        count = 0
        for i in range(1, int(n ** 0.5) + 1):
            if n % i == 0:
                count += 2
                if i*i==n:
                    count -=1
        return count
    answer = 0
    for i in range(1, number + 1):
        if divisor_count(i) > limit:
            answer += power
        else:
            answer += divisor_count(i)
    
    return answer