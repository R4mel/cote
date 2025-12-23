from collections import defaultdict

multi_dict = defaultdict(list)
n = int(input())

for _ in range(n):
    x,y = map(int, input().split())
    multi_dict[x].append(y)

for k in sorted(multi_dict.keys()):
    sorted_values = sorted(multi_dict[k])
    for value in sorted_values:
        print(k, value)
