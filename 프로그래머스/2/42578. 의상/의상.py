def solution(clothes):
    # 종류별로 (의상 + 1) 곱한 다음에 아무것도 안입은 상태(1)를 빼줌
    closet = {}
    for name, kind in clothes:
        if kind in closet:
            closet[kind] += 1
        else:
            closet[kind] = 1
    answer = 1
    
    for count in closet.values():
        answer *= count + 1
    
    return answer-1