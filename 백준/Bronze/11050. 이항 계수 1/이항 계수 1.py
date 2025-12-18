import sys, math
input = sys.stdin.readline

n, k = map(int, input().split())

print(math.factorial(n) // (math.factorial(k) * math.factorial(n-k)))
