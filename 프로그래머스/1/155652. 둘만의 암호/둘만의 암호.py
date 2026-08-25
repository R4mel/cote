def solution(s, skip, index):
    arr = []

    for c in s:
        count = 0
        while count < index:
            c = chr((ord(c) - ord('a') + 1) % 26 + ord('a'))
            if c not in skip:
                count += 1

        arr.append(c)

    return ''.join(arr)