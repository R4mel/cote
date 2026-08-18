def solution(s):
    words = s.split(' ')
    answer = []

    for word in words:
        if word:
            word = word[0].upper() + word[1:].lower()
        answer.append(word)

    return ' '.join(answer)