from itertools import permutations
def solution(numbers):
    answer = 0
    res = set()
    for i in range(1, len(numbers) + 1):
        for x in permutations(numbers, i):
            number = int(''.join(x))
            res.add(number)
    for n in res:
        isPrime = True
        for i in range(2, int(n ** 0.5) + 1):
            if n % i == 0:
                isPrime = False
                break
        if isPrime and n >= 2:
            answer += 1
    return answer
            
                