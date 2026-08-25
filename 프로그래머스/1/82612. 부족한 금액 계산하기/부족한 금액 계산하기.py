def solution(price, money, count):
    pay = 0
    for i in range(count):
        pay += (price + i * price)
    if pay > money:
        return pay - money
    else:
        return 0