def solution(n):
    def to_base_3(n):
        if n == 0:
            return "0"
        res = ""
        while n > 0:
            n, mod = divmod(n, 3)
            res += str(mod)
            
        return res[::-1]

    a = to_base_3(n)
    a = a[::-1]
    return int(a, 3)