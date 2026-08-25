def solution(babbling):
    answer = 0
    words = ["aya", "ye", "woo", "ma"]

    for b in babbling:
        prev = ""
        while b:
            found = False
            for w in words:
                if b.startswith(w) and w != prev:
                    b = b[len(w):]
                    prev = w
                    found = True
                    break

            if not found:
                break

        if not b:
            answer += 1

    return answer