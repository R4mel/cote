from itertools import permutations
def solution(numbers):
    answer = 0
    def isPrime(n):
        if n<2:
            return False
        for i in range(2, int(n ** 0.5)+1):
            if n % i==0:
                return False
        return True
    
    prime = set()
    for i in range(1, len(numbers)+1):
        tmp = permutations(numbers, i)
        for t in tmp:
            prime.add(int(''.join(t)))
    
    print(prime)
    for i in prime:
        if isPrime(i):
            answer += 1
    return answer