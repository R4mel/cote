def solution(n, words):
    used = set()

    for i in range(len(words)):
        # 중복 단어
        if words[i] in used:
            return [i % n + 1, i // n + 1]

        # 앞 단어와 연결되는지 확인
        if i > 0 and words[i - 1][-1] != words[i][0]:
            return [i % n + 1, i // n + 1]

        used.add(words[i])

    return [0, 0]