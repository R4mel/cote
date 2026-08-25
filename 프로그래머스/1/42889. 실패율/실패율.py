from collections import Counter
def solution(N, stages):
    count = Counter(stages)
    answer = []
    total = len(stages)

    for stage in range(1, N + 1):
        if total == 0:
            failure = 0
        else:
            failure = count[stage] / total

        answer.append((stage, failure))
        total -= count[stage]

    answer.sort(key=lambda x: (-x[1], x[0]))

    return [stage for stage, failure in answer]