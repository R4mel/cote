def solution(price, money, count):
    ll = []
    for i in range(count):
        ll.append(price + i * price)
    if sum(ll) > money:
        return sum(ll) - money
    else:
        return 0