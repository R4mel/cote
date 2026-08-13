def solution(a, b, n):
    answer = 0
    while n >= a:
        tmp = n // a * b # 빈병 구하기
        n = tmp + n % a # 빈병이랑 빈병이 a보다 작을때 나머지 값
        answer += tmp # 빈병 더하기
    return answer