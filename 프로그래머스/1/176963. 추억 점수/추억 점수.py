def solution(name, yearning, photo):
    answer = []
    tmp = dict(zip(name, yearning))
    for p in photo:
        s = 0
        for person in p:
            if person in tmp:
                s+= tmp[person]
        answer.append(s)
    
    return answer